package com.ipiecoles.java.audio;

import com.ipiecoles.java.audio.repository.AlbumRepository;
import com.ipiecoles.java.audio.repository.ArtistRepository;
import org.hibernate.validator.constraints.Range;
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
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;
    //private Object title;
    private String NameAlbum;
    private List<Album> AllAlbum;

    @Override
    public void run(String... args) throws Exception {

        //Find album by Id
        NameAlbum = albumRepository.findTitleById((long) 8).getTitle();
        System.out.println("Le nom de l'album est : " + NameAlbum);

        //Find all Album
       // AllAlbum = (List<Album>) albumRepository.findAllTitle(Collections.singleton(""));
        //System.out.println(AllAlbum);
    }
}