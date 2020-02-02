package com.ipiecoles.java.audio;

import com.ipiecoles.java.audio.model.Album;
import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(albumRepository.findByTitle("Facelift").get(3));
        System.out.println(albumRepository.findTitleByalbumid((long) 8).getTitle());
        System.out.println(albumRepository.findTitleByTitle("Balls to the Wall").getTitle());
        //System.out.println(albumRepository.findAllTitle("").get(1));
        //System.out.println(albumRepository.findAllById(2).getClass());
        System.out.println(artistRepository.findNameContainStringIgnoreCase("AC/DC"));

    }
}