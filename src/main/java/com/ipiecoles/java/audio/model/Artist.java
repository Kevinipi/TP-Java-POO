package com.ipiecoles.java.audio.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Table(name="artist")

public /*abstract*/ class Artist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long artistid;

    private String name;

    //Contructor
        public Artist() {
        }

        public Artist(Long id, String nom) {
            this.artistid = id;
            this.name = nom;
        }
    //Getter and Setter

        public Long getId() {
            return artistid;
        }

        public void setId(Long id) {
            this.artistid = id;
        }

        public String getNom() {
            return name;
        }

        public void setNom(String nom) {
            this.name = nom;
        }

    //End Constructor


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

}
