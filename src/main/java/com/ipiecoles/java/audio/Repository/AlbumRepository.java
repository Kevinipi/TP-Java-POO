package com.ipiecoles.java.audio.Repository;

import com.ipiecoles.java.audio.model.Album;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface AlbumRepository extends PagingAndSortingRepository <Album, Long> {
    Album findByAlbumid (Integer Albumid);

    List<Album> findByTitle (String title);
}
