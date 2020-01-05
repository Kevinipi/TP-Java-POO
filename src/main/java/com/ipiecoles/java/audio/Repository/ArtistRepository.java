package com.ipiecoles.java.audio.Repository;

import com.ipiecoles.java.audio.model.Album;
import com.ipiecoles.java.audio.model.Artist;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;


@Repository
public interface ArtistRepository extends PagingAndSortingRepository <Artist, Long> {

   // Artist findById (String artistid);

    //Récupération de manière paginée
    //Page<Artist> findByNomIgnoreCase (String name, Pageable pageable);

}
