package com.sparta.halls.app.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Halls {
    private int hallsId;
    private String hallName;
    private BigDecimal distToUni;
    private Integer numOfRooms;
    private String description;
    private String contactEmail;
    private Set<HallPictures> pictures = new HashSet<>();

    @OneToMany(mappedBy = "hall")
    public Set<HallPictures> getPictures() {
        return pictures;
    }

    public void setPictures(Set<HallPictures> pictures) {
        this.pictures = pictures;
    }

    @Id
    @Column(name = "halls_id")
    public int getHallsId() {
        return hallsId;
    }

    public void setHallsId(int hallsId) {
        this.hallsId = hallsId;
    }

    @Basic
    @Column(name = "hall_name")
    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    @Basic
    @Column(name = "dist_to_uni")
    public BigDecimal getDistToUni() {
        return distToUni;
    }

    public void setDistToUni(BigDecimal distToUni) {
        this.distToUni = distToUni;
    }

    @Basic
    @Column(name = "num_of_rooms")
    public Integer getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(Integer numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "contact_email")
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Halls halls = (Halls) o;

        if (hallsId != halls.hallsId) return false;
        if (hallName != null ? !hallName.equals(halls.hallName) : halls.hallName != null) return false;
        if (distToUni != null ? !distToUni.equals(halls.distToUni) : halls.distToUni != null) return false;
        if (numOfRooms != null ? !numOfRooms.equals(halls.numOfRooms) : halls.numOfRooms != null) return false;
        if (description != null ? !description.equals(halls.description) : halls.description != null) return false;
        if (contactEmail != null ? !contactEmail.equals(halls.contactEmail) : halls.contactEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hallsId;
        result = 31 * result + (hallName != null ? hallName.hashCode() : 0);
        result = 31 * result + (distToUni != null ? distToUni.hashCode() : 0);
        result = 31 * result + (numOfRooms != null ? numOfRooms.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (contactEmail != null ? contactEmail.hashCode() : 0);
        return result;
    }
}
