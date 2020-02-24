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
    @JoinColumn(name="artistId")
    private Artist artist;

    /* Constructor */

    public Album() {}

    public Album(Long id, String title, Artist artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /* End Getter and Setter */
}

