package com.sparta.halls.app.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pictures {
    private int pictureId;
    private String pictureName;
    private String pictureLocation;
    public Set<HallPictures> halls= new HashSet<>();
    public Set<RoomTypePictures> roomTypes= new HashSet<>();

    @OneToMany(mappedBy = "picture")
    public Set<HallPictures> getHalls() {
        return halls;
    }

    public void setHalls(Set<HallPictures> halls) {
        this.halls = halls;
    }

    @OneToMany(mappedBy = "picture")
    public Set<RoomTypePictures> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(Set<RoomTypePictures> roomTypes) {
        this.roomTypes = roomTypes;
    }

    @Id
    @Column(name = "picture_id")
    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Basic
    @Column(name = "picture_name")
    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    @Basic
    @Column(name = "picture_location")
    public String getPictureLocation() {
        return pictureLocation;
    }

    public void setPictureLocation(String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pictures pictures = (Pictures) o;

        if (pictureId != pictures.pictureId) return false;
        if (pictureName != null ? !pictureName.equals(pictures.pictureName) : pictures.pictureName != null)
            return false;
        if (pictureLocation != null ? !pictureLocation.equals(pictures.pictureLocation) : pictures.pictureLocation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pictureId;
        result = 31 * result + (pictureName != null ? pictureName.hashCode() : 0);
        result = 31 * result + (pictureLocation != null ? pictureLocation.hashCode() : 0);
        return result;
    }
}
