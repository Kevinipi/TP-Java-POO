package com.ipiecoles.java.audio.controller;

import com.ipiecoles.java.audio.model.Album;
import com.ipiecoles.java.audio.model.Artist;
import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import com.ipiecoles.java.audio.security.ConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.Optional;


@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private  ArtistRepository artistRepository;

    /*7 - Ajout d'un album + Exceptions*/

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, value="")

    public Album addAlbum (
            @RequestBody Album album
    )throws ConflictException{
        return albumRepository.save(album);
        /*
       Optional<Album> albumTitle = albumRepository.findByTitle(album.getTitle());
        if(albumTitle != null){
            throw new ConflictException("L'artiste : " + album.getTitle() + "éxiste déjà ! ");
        }
         */
    }

    /*8 - Suppression d'un album*/

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public @ResponseBody void deleteAlbum(
    @PathVariable("id") Long idAlbum)
    {
        albumRepository.deleteById(idAlbum);
    }
}

