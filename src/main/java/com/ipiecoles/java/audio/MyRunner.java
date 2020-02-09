package com.ipiecoles.java.audio;

import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import com.ipiecoles.java.audio.model.Artist;
import com.ipiecoles.java.audio.model.Album;

import javax.persistence.criteria.CriteriaBuilder;
import java.awt.print.Pageable;
import java.util.Collections;
@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;
    private Object Pageable;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(albumRepository.findByTitle("Facelift").get(3));
        System.out.println(albumRepository.findTitleByalbumid((long) 8).getTitle());
        System.out.println(albumRepository.findTitleByNameOfArtist(""));
        //System.out.println(albumRepository.findTitleByTitle("Balls to the Wall").getTitle());

    }
}