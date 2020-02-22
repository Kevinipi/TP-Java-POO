package com.ipiecoles.java.audio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="artist")

public class Artist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //Contructor

    public Artist() {

    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //Permet de dire qu'un artiste à plusieur album
    @OneToMany(mappedBy = "artistId")
    @JsonIgnoreProperties("artistId") //Evite la boucle infinie
    private Set<Album> albums = new HashSet<>();

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
    //End Constructor

}
