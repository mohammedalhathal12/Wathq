package com.example.Tajseer.Model;

import javax.persistence.*;

@Entity
@Table
public class Org {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_Org")
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="Address")
    private String Address;
    @Column(name="Password")
    private int Password;
    @Column(name="Email")
    private int email;

    public Org() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }
}
