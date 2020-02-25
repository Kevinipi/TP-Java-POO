package com.ipiecoles.java.audio.repository;

import com.ipiecoles.java.audio.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    Optional<Album> findByTitle(String title);

    List<Album> findAllById(Long id);

    Optional<Album> findById(Long id);

    Optional<Album> findByartistId(Long artistId);

    boolean existsByTitle(String title);

    //List<Album> findTitle(String s);

    //Album createAlbum(Album album);


    //List<Album> findByName(String s);


    //List<Album> findAllTitle(Iterable<String> titles);
}
