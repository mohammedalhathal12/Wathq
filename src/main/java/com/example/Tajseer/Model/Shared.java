package com.example.Tajseer.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Shared {
    @Id
    @Column(name = "SharedID")
    private int sharedID;
    @Column(name = "SharedDate")
    private String sharedDate;
    @Column(name = "SharedUrl")
    private String sharedUrl;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    private Users userShareds;

    @ManyToMany(mappedBy = "shareds", cascade = {CascadeType.ALL})
    private Set<Cretifcation> certificates = new HashSet<Cretifcation>();

    public Shared() {}

    public Shared(int sharedID, String sharedDate, String sharedUrl) {
        this.sharedID = sharedID;
        this.sharedDate = sharedDate;
        this.sharedUrl = sharedUrl;
    }

    public int getSharedID() {
        return sharedID;
    }

    public void setSharedID(int sharedID) {
        this.sharedID = sharedID;
    }

    public String getSharedDate() {
        return sharedDate;
    }

    public void setSharedDate(String sharedDate) {
        this.sharedDate = sharedDate;
    }

    public String getSharedUrl() {
        return sharedUrl;
    }

    public void setSharedUrl(String sharedUrl) {
        this.sharedUrl = sharedUrl;
    }

    public Users getUserShareds() {
        return userShareds;
    }

    public void setUserShareds(Users userShareds) {
        this.userShareds = userShareds;
    }

    public Set<Cretifcation> getCertificates() {
        return certificates;
    }

    public void setCertificates(Set<Cretifcation> certificates) {
        this.certificates = certificates;
    }}
