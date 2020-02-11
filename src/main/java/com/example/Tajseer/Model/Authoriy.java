package com.example.Tajseer.Model;

import javax.persistence.*;

@Entity
@Table
public class Authoriy {
    @Id@GeneratedValue
    private int id;
    @Column(name="authorName")
    private String authorName;
    @Column(name="authorDec")
    private String authorDec;

    public Authoriy(int id, String authorName, String authorDec) {
        this.id = id;
        this.authorName = authorName;
        this.authorDec = authorDec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDec() {
        return authorDec;
    }

    public void setAuthorDec(String authorDec) {
        this.authorDec = authorDec;
    }
}
