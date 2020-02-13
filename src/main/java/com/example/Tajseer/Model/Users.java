package com.example.Tajseer.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
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

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Cretifcation> certificates = new ArrayList<>();


    @OneToMany(mappedBy = "userShareds", cascade = CascadeType.ALL)
    private List<Shared> shareds = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Authority")
    private Authoriy authoriy;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "org")
    private Org org;

    public List<Shared> getShareds() {
        return shareds;
    }

    public void setShareds(List<Shared> shareds) {
        this.shareds = shareds;
    }

    public Users(List<Shared> shareds) {
        this.shareds = shareds;
    }

    public Users(int id, String name, String last_name, int password, int email, int status, List<Cretifcation> certificates, Authoriy authoriy, Org org, int orgID) {
        Id = id;
        Name = name;
        this.last_name = last_name;
        Password = password;
        Email = email;
        Status = status;
        this.certificates = certificates;
        this.authoriy = authoriy;
        this.org = org;
        this.orgID = orgID;
    }

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    public Users(Org org) {
        this.org = org;
    }

    public Users(int id, String name, String last_name, int password, int email, int status, List<Cretifcation> certificates, Authoriy authoriy, int orgID) {
        Id = id;
        Name = name;
        this.last_name = last_name;
        Password = password;
        Email = email;
        Status = status;
        this.certificates = certificates;
        this.authoriy = authoriy;
        this.orgID = orgID;
    }

    @Column(name = "OrgID")
    private int orgID;
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

    public List<Cretifcation> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Cretifcation> certificates) {
        this.certificates = certificates;
    }

    public Authoriy getAuthoriy() {
        return authoriy;
    }

    public void setAuthoriy(Authoriy authoriy) {
        this.authoriy = authoriy;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }
}