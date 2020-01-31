package com.ipiecoles.java.audio.repository;

        import com.ipiecoles.java.audio.model.Album;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends PagingAndSortingRepository <Album, Long> {

    /**
     * @return Ajouter une méthode permettant de rechercher un album en fonction de son nom
     * @param Title
     */
    // Album findByArtistid (int Artistid);

    Album findByTitle (String Title);
}
