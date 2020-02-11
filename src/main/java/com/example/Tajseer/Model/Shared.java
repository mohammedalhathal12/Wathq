package com.example.Tajseer.Model;

import javax.persistence.*;

@Entity
@Table
public class Shared {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="Shared")
    private String Shared;
    @Column(name="SharedDec")
    private String SharedDec;
    @Column(name="Url")
    private int Url;

    public Shared() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShared() {
        return Shared;
    }

    public void setShared(String shared) {
        Shared = shared;
    }

    public String getSharedDec() {
        return SharedDec;
    }

    public void setSharedDec(String sharedDec) {
        SharedDec = sharedDec;
    }

    public int getUrl() {
        return Url;
    }

    public void setUrl(int url) {
        Url = url;
    }
}
