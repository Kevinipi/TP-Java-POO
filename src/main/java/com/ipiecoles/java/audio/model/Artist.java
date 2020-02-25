package com.ipiecoles.java.audio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="artist")

public class Artist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //Permet de dire qu'un artiste à plusieur album
    @OneToMany(mappedBy = "artist")
    @JsonIgnoreProperties("artist") //Evite la boucle infinie
    private List<Album> albums;

    /**
     * Begin Constructor
     */

    public Artist(Long id, String name, List<Album> albums) {
        this.id = id;
        this.name = name;
        this.albums = albums;
    }

    public Artist() {
    }
    /**
     * End Constructor
     */

    /**
     * Begin Getter and Setter
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    /**
     * End Getter and Setter
     */
}
