package com.ipiecoles.java.audio.repository;

import com.ipiecoles.java.audio.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Pageable;


@Repository
public interface ArtistRepository extends PagingAndSortingRepository<Artist, Integer> {

/**
 * @return Ajouter une méthode permettant de récupérer de manière paginée les artistes dont le nom contient une chaine
 * de caractère sans prendre en compte la casse.
 */
    //Artist findByArtistidAndName (Integer artistid, String name);
   // Page<Artist> findByNameContainingStringAndIgnoreCase(String Name, Pageable pageable);

    //Page<Artist> findAll(Pageable pageable);

    //boolean findByNameContainingStringAndIgnoreCase(String s);

    //String findByNameContainingStringAndIgnoreCase(String s);

    //SpringDataWebProperties findByNomContainStringAndfIgnoreCase(String accept);
}
