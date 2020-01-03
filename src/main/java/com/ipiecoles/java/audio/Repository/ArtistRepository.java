package com.ipiecoles.java.audio.Repository;

import com.ipiecoles.java.audio.model.Artist;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArtistRepository extends PagingAndSortingRepository <Artist, Long> {
}
