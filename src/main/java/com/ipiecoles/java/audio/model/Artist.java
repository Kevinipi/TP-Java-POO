package com.ipiecoles.java.audio.model;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="Album")

public abstract class Artist {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
}
