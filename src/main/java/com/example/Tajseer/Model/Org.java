package com.example.Tajseer.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Cretifcation> certificates = new ArrayList<>();
    @OneToMany(mappedBy = "org", cascade = CascadeType.ALL)
    private List<Users> users = new ArrayList<>();

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public Org(int id, String name, String address, int password, int email, List<Cretifcation> certificates, List<Users> users) {
        this.id = id;
        this.name = name;
        Address = address;
        Password = password;
        this.email = email;
        this.certificates = certificates;
        this.users = users;
    }

    public List<Users> getUsers() {
        return users;
    }

    public Org(int id, String name, String address, int password, int email, List<Cretifcation> certificates) {
        this.id = id;
        this.name = name;
        Address = address;
        Password = password;
        this.email = email;
        this.certificates = certificates;
    }

    public Org() {

    }

    public List<Cretifcation> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Cretifcation> certificates) {
        this.certificates = certificates;
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
