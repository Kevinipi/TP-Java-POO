package com.ipiecoles.java.audio.repository;

import com.ipiecoles.java.audio.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;


@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findById(Long id);

    Page<Artist> findByNameContaining(String name, Pageable pageable);

    //Page<Artist> findAllArtists(String name, PageRequest of);

    //Object findAll(String name, PageRequest of);

    //Page<Artist> findByNameOrderByNameAsc(Pageable pageable);

   // Page<Artist> findByNameOrderByNameAsc(PageRequest of);

/**
 * @return Ajouter une méthode permettant de récupérer de manière paginée les artistes dont le nom contient une chaine
 * de caractère sans prendre en compte la casse.
 */
    //Artist findByArtistidAndName (Integer artistid, String name);
    // Page<Artist> findByNameContainingStringAndIgnoreCase(String Name, Pageable pageable);

    //Page<Artist> findAll(Pageable pageable);
    
    
}
