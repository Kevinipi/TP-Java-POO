package com.ipiecoles.java.audio.repository;

        import com.ipiecoles.java.audio.model.Album;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {

    /**
     * @return Ajouter une méthode permettant de rechercher un album en fonction de son nom
     * @param id
     * @param  title
     */
    // Album findByArtistid (int Artistid);

   // List<Album> title = AlbumRepository.findByAlbumIdAndTitle (String title)

    Iterable<Album> findAll ();
    Album findTitleByalbumid (Long id);
    Album findTitleByTitle (String title);
    Album findTitleByNameOfArtist (String title);

    //List <Album> findAllTitle(String s);

    //Album findAllById(int i);
    //Long  findAllById(int i);
}
