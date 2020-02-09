package com.ipiecoles.java.audio.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="album")

public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long albumid;

    private String title;

    @OneToMany
    private List<Album> artistid;

    /* Constructor */

        public Album(){
        }

    public Album (Long albumid, String title, List<Album> artistid) {
        this.albumid = albumid;
        this.title = title;
        this.artistid = artistid;
    }

    /* End Constructor */


    /* Getter and Setter */
        public Long getAlbumid(int i) {
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

        public List<Album> getArtistid() {
            return artistid;
        }

        public void setArtistid(List<Album> artistid) {
            this.artistid = artistid;
        }

    /* End Getter and Setter */
}

