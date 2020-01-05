package com.ipiecoles.java.audio.model;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="Album")

public abstract class Artist {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long artistid;

    private String nom;

    //Contructor
        public Artist(Long id, String nom) {
            this.artistid = id;
            this.nom = nom;
        }
    //Getter and Setter

        public Long getId() {
            return artistid;
        }

        public void setId(Long id) {
            this.artistid = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
    //End Constructor
}
