package com.example.Tajseer.Model;

import javax.persistence.*;
import javax.swing.text.Document;
import java.util.*;

@Entity
@Table
public class Cretifcation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="nameCre")
    private String nameCre;
    @Column(name="type")
    private String type;
    @Column(name = "address")
    private String address;
    @Column(name="descr")
    private String descr;
    @Column(name="date")
    private String date;
    @Column(name="document")
    @Lob
    private byte[] document;

    public Cretifcation(int id, String nameCre, String type, String address, String descr, String date, byte[] document, Users user, Set<Shared> shareds, Org organization, Org org) {
        this.id = id;
        this.nameCre = nameCre;
        this.type = type;
        this.address = address;
        this.descr = descr;
        this.date = date;
        this.document = document;
        this.user = user;
        this.shareds = shareds;
        this.organization = organization;
        this.org = org;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_user")
    private Users user;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "certificates_shareds",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "SharedID")}
    )
    private Set<Shared> shareds = new HashSet<Shared>();

    public Set<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(Set<Shared> shareds) {
        this.shareds = shareds;
    }

    public Cretifcation(String fileName, String contentType, byte[] bytes) {
    }

    public Org getOrganization() {
        return organization;
    }

    public void setOrganization(Org organization) {
        this.organization = organization;
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

    public Cretifcation(int id, String name, String type, String address, String descr, String date, byte[] document, Users user, Org org) {
        this.id = id;
        this.nameCre = nameCre;
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

    public String getNameCre() {
        return nameCre;
    }

    public void setNameCre(String nameCre) {
        this.nameCre = nameCre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nameCre;
    }

    public void setName(String name) {
        this.nameCre = nameCre;
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

    public byte[]  getDocument() {
        return document;
    }

    public void setDocument(byte[] document ) {
        this.document = document;
    }
}
