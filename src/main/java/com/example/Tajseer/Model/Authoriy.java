package com.example.Tajseer.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Authoriy {
    @Id@GeneratedValue
    @Column(name="autorId")
    private int id;
    @Column(name="authorName")
    private String authorName;
    @Column(name="authorDec")
    private String authorDec;

    @OneToMany(mappedBy = "authoriy", cascade = CascadeType.ALL)
    private List<Users> users = new ArrayList<>();
    public Authoriy(int id, String authorName, String authorDec) {
        this.id = id;
        this.authorName = authorName;
        this.authorDec = authorDec;
    }

    public Authoriy(int id, String authorName, String authorDec, List<Users> users) {
        this.id = id;
        this.authorName = authorName;
        this.authorDec = authorDec;
        this.users = users;
    }

    public Authoriy() {

    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
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
