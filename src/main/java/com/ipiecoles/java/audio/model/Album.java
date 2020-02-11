package com.ipiecoles.java.audio.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="album")

public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name="artistId", nullable = false)
    private Artist artistId;

    /* Constructor */

    public Album() {
        super();
    }

    /* End Constructor */


    /* Getter and Setter */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtistId() {
        return artistId;
    }

    public void setArtistId(Artist artistId) {
        this.artistId = artistId;
    }

    /* End Getter and Setter */
}

