package com.ipiecoles.java.audio.Repository;

import com.ipiecoles.java.audio.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;


@Repository
public interface ArtistRepository extends PagingAndSortingRepository <Artist, Long> {

    //Artist findById (String artistid);

    //List<Artist> findAlbumByName (String albumid, String artistid);

    //Récupération de manière paginée
    Page<Artist> findByNomIgnoreCase (String name, Pageable pageable);

}
