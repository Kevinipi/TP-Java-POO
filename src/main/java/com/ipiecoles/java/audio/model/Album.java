package com.ipiecoles.java.audio.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Artist")
public abstract class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
