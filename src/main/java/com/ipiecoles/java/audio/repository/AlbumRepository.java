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
     */
    Album findTitleById(Long id);

    Optional<Album> findByTitle(String title);

    List<Album> findAllById(Long id);

    Optional<Album> findById(Long id);

    Optional<Album> findByartistId(Long artistId);

    boolean existsByTitle(String title);
}
