package com.example.Tajseer.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_user")
    private int Id;
    @Column(name = "First_name")
    private String Name;
    @Column(name = "Last_name")
    private String last_name;
    @Column(name = "password")
    private int Password;
    @Column(name = "email")
    private int Email;
    @Column(name = "Status")
    private int Status;

    public Users() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getEmail() {
        return Email;
    }

    public void setEmail(int email) {
        Email = email;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }


}