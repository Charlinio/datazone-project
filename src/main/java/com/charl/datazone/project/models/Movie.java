package com.charl.datazone.project.models;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Column(name = "id", columnDefinition = "int(5) unsigned")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "synopsis", length = 500)
    private String synopsis;

    @Column(name = "genre", columnDefinition = "char(20)")
    private String genre;

    @Column(name = "director", length = 30)
    private String director;

    @Column(name = "picture", columnDefinition = "char(30)")
    private String picture;

    public Movie() {
    }

    public Movie(int id, String title, String synopsis, String genre, String director, String picture) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.genre = genre;
        this.director = director;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
