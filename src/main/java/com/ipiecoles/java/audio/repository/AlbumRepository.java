package com.ipiecoles.java.audio.repository;

        import com.ipiecoles.java.audio.model.Album;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {

    /**
     * @return Ajouter une méthode permettant de rechercher un album en fonction de son nom
     * @param id
     */
    // Album findByArtistid (int Artistid);

   // List<Album> title = AlbumRepository.findByAlbumIdAndTitle (String title)

    Album findTitleByalbumid (Long id);
    //Long  findAllById(int i);
}
