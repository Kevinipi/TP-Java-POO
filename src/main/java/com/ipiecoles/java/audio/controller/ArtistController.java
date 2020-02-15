package com.ipiecoles.java.audio.controller;

import com.ipiecoles.java.audio.model.Artist;
import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.persistence.EntityNotFoundException;
import javax.xml.transform.sax.SAXResult;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;


    /*1 - Afficher un artiste, puis erreur 404*/

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Artist getArtistId(
            @PathVariable("id") Long id
    ){
        Optional<Artist> a = artistRepository.findById(id);
        if (a.isPresent()){
            return a.get();
        }
        throw new EntityNotFoundException("L'artiste avec l'id : "+ id +"n'existe pas ! ");
    }

    /*2 - Rechercher un artist par son nom*/

    @RequestMapping(method = RequestMethod.GET, params = "name")
    public Page<Artist> getNameOfArtist (
            @RequestParam("name") String name,
        //@PathVariable("name") String name,
        @RequestParam("page")Integer page,
        @RequestParam("size") Integer size,
        @RequestParam("sortProperty") String sortProperty,
        @RequestParam("sortDirection") Sort.Direction sortDirection
    ){
        Page<Artist> artists =  artistRepository.findByNameContaining(name, PageRequest.of(page, size, sortDirection, sortProperty));

        if(size < 1 || size > 50){ //permet que si un attaquant veux faire tomber notre site en augmentant la taille du nombre de page il ne pourra pas
            throw new IllegalArgumentException("Le nombres d'élements est trop important ! Loupé ");
        }
        return artists;
    }

    /*  3. Listes des artistes + Exceptions */

    @RequestMapping(method = RequestMethod.GET)
        public Page<Artist> getArtistList (
                @RequestParam("page")Integer page,
                @RequestParam("size") Integer size,
                @RequestParam("sortDirection") Sort.Direction sortDirection,
                @RequestParam("sortProperty") String name
    ){
        Page<Artist> artists = artistRepository.findAll(PageRequest.of(page, size, sortDirection, name));

        if (size < 1 || size > 50){
            throw new IllegalArgumentException("Le nombres d'élements est trop important ! Loupé ");
        }
        return artists;
    }

    /*4. Création d’un artiste + Exception 409 (à finir)*/

    @RequestMapping(method = RequestMethod.POST,
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
        public Artist dataError (
                @RequestBody Artist artist
    ){
        List<Artist> listArtist = artistRepository.findByName("");

            //throw new DataIntegrityViolationException("L'artist "+ artist + "existe déjà !" );
       if(artist == listArtist) {
           throw new DataIntegrityViolationException("Le nom saisie existe déjà");
       }
        return artistRepository.save(artist);
    }

    /* 5 - Modification d'un artiste */

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Artist modifArtist (
        @PathVariable("id") Long idArtist,
        @RequestBody Artist artist)
    {
        return artistRepository.save(artist);
    }

    /*6 - Suppression d'un artiste*/

    @RequestMapping (method = RequestMethod.DELETE, value = "/{id}")
    //@ResponseStatus(HttpStatus.NO_CONTENT)
    public void  deleteArtist(
            @PathVariable("id") Long idArtist)
    {
        Optional<Artist> a = artistRepository.findById(idArtist);
        if (a.isPresent()){
           artistRepository.deleteById(idArtist);
        }
        throw new EntityNotFoundException("L'artiste avec l'id : "+ idArtist +"n'existe plus ! ");
}
}
