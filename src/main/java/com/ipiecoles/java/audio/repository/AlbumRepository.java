package com.ipiecoles.java.audio.repository;

import com.ipiecoles.java.audio.model.Album;
import org.hibernate.validator.constraints.EAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

    /**
     * @return Ajouter une méthode permettant de rechercher un album en fonction de son nom
     * @param id
     * @param  title
     */
    // Album findByArtistid (int Artistid);

    // List<Album> title = AlbumRepository.findByAlbumIdAndTitle (String title)

    //Iterable<Album> findAll ();
    Album findTitleById(Long id);

    //List<Album> findAllTitle(Iterable<String> titles);
}
