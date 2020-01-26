package com.ipiecoles.java.audio.Repository;

import com.ipiecoles.java.audio.model.album;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends PagingAndSortingRepository <album, Long> {

/**
* @return Ajouter une méthode permettant de rechercher un album en fonction de son nom
 * @param Title
 */
   // Album findByArtistid (int Artistid);

    List<album> findByTitle (String Title);
}
