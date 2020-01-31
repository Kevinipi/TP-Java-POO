package com.ipiecoles.java.audio.model;

import javax.persistence.*;

@Entity
@Table(name="album")

public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long albumid;

    private String title;

    @OneToMany
    private Long artistid;

    //Constructor

        public Album(){
            super();
        }

    public Album (Long albumid, String title, Long artistid) {
        this.albumid = albumid;
        this.title = title;
        this.artistid = artistid;
    }

    //Getter and Setter
        public Long getAlbumid() {
            return albumid;
        }

        public void setAlbumid(Long albumid) {
            this.albumid = albumid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Long getArtistid() {
            return artistid;
        }

        public void setArtistid(Long artistid) {
            this.artistid = artistid;
        }
    //End Constructor
}

