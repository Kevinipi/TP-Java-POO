package com.ipiecoles.java.audio.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.*;
import java.util.Objects;
import java.util.List;

@Entity
@Table(name="artist")

public class Artist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;

    private Long id;

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


    //End Constructor

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(artistid, artist.artistid) &&
                Objects.equals(name, artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistid, name);
    }
*/
}
