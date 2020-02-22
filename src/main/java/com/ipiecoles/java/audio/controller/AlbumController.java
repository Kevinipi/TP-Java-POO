package com.ipiecoles.java.audio.controller;

import com.ipiecoles.java.audio.model.Album;
import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private  ArtistRepository artistRepository;

    /*7 - Ajout d'un album*/

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Album createAlbum (@RequestBody Album album)throws DataIntegrityViolationException {

        return this.albumRepository.save(album);
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

