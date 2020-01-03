package com.ipiecoles.java.audio.Repository;

import com.ipiecoles.java.audio.model.Album;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends PagingAndSortingRepository <Album, Long> {
}
