package com.ipiecoles.java.audio.repository;

import com.ipiecoles.java.audio.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;


@Repository
public interface ArtistRepository extends PagingAndSortingRepository <Artist, Long> {

/**
 * @return Ajouter une méthode permettant de récupérer de manière paginée les artistes dont le nom contient une chaine
 * de caractère sans prendre en compte la casse.
 */
    //Artist findByArtistidAndName (Integer artistid, String name);
    //Page<Artist> findByNomIgnoreCase (String name, Pageable pageable);
}
