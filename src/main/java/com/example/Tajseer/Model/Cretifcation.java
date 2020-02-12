package com.example.Tajseer.Model;

import javax.persistence.*;
import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Cretifcation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="type")
    private String type;
    @Column(name = "address")
    private String address;
    @Column(name="descr")
    private String descr;
    @Column(name="date")
    private String date;
    @Column(name="document")
    private String document;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_user")
    private Users user;

    public Org getOrganization() {
        return organization;
    }

    public void setOrganization(Org organization) {
        this.organization = organization;
    }

    public Cretifcation(int id, String name, String type, String address, String descr, String date, String document, Users user, Org organization, Org org) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.descr = descr;
        this.date = date;
        this.document = document;
        this.user = user;
        this.organization = organization;
        this.org = org;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrganizationID")
    private Org organization;
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public Cretifcation(int id, String name, String type, String address, String descr, String date, String document, Users user, Org org) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.descr = descr;
        this.date = date;
        this.document = document;
        this.user = user;
        this.org = org;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Org")
    private Org org;
    public Cretifcation(Users user) {
        this.user = user;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Cretifcation( ) {

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return descr;
    }

    public void setDesc(String desc) {
        this.descr = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
