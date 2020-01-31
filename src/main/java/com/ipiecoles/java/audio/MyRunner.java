package com.ipiecoles.java.audio;

import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(artistRepository);
        //System.out.println(albumRepository.findByArtistid(1));
        //System.out.println(albumRepository.findBytitle("For Those About To Rock We Salute You"));
        System.out.println(albumRepository.findByTitle("For Those About To Rock We Salute You"));

    }
}