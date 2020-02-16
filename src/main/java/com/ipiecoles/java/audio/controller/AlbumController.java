package com.ipiecoles.java.audio.controller;

import antlr.debug.SemanticPredicateListener;
import com.ipiecoles.java.audio.model.Album;
import com.ipiecoles.java.audio.model.Artist;
import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private  ArtistRepository artistRepository;

    /*8 - Suppression d'un album*/

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public @ResponseBody void deleteAlbum(
    @PathVariable("id") Long idAlbum)
    {
        albumRepository.deleteById(idAlbum);
    }
}

