package com.ipiecoles.java.audio.Repository;

import com.ipiecoles.java.audio.model.artist;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistRepository extends PagingAndSortingRepository <artist, Long> {

/**
 * @return Ajouter une méthode permettant de récupérer de manière paginée les artistes dont le nom contient une chaine
 * de caractère sans prendre en compte la casse.
 */
    artist findByArtistidAndName (Integer artistid, String name);
    //Page<Artist> findByNomIgnoreCase (String name, Pageable pageable);

}
