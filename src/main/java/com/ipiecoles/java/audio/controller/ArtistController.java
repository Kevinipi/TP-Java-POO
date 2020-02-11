package com.ipiecoles.java.audio.controller;

import com.ipiecoles.java.audio.model.Artist;
import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.ipiecoles.java.audio.security.GlobalExceptionHandler;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;

    /*1 - Afficher un artiste*/
    @RequestMapping (method = RequestMethod.GET, value = "/{artistid}")
    public Artist getArtistId (
            @PathVariable("artistid") Long idArtist
    ){
        Optional<Artist> a = artistRepository.findById(idArtist);
        if (a.isPresent()){
            return a.get();
        }
        throw new EntityNotFoundException("L'employé d'id "+idArtist+"n'existe pas ! ");
    }
}
