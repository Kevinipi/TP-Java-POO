package com.ipiecoles.java.audio.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
import java.util.List;

@Entity
@Table(name="artist")

public class Artist<artistid> {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;

    @ManyToOne(targetEntity = Artist.class)
    private List<Artist> artistid;

    //Contructor
        public Artist() {
        }

        public Artist(List<Artist> id, String nom) {
            this.artistid = id;
            this.name = nom;
        }
    //Getter and Setter

        public List<Artist> getId() {
            return artistid;
        }

        public void setId(List<Artist> id) {
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
