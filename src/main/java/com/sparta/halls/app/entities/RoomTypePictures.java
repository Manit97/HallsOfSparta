package com.sparta.halls.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "room_type_pictures", schema = "sparta_rooms")
@IdClass(RoomTypePicturesPK.class)
public class RoomTypePictures {
    private int pictureId;
    private int roomTypeId;

    private Pictures picture;
    private RoomTypes roomType;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="picture_id", insertable = false, updatable = false)
    public Pictures getPicture() {
        return picture;
    }

    public void setPicture(Pictures picture) {
        this.picture =picture;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="room_type_id", insertable = false, updatable = false)
    public RoomTypes getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypes roomType) {
        this.roomType = roomType;
    }

    @Id
    @Column(name = "picture_id")
    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Id
    @Column(name = "room_type_id")
    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoomTypePictures that = (RoomTypePictures) o;

        if (pictureId != that.pictureId) return false;
        if (roomTypeId != that.roomTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pictureId;
        result = 31 * result + (pictureId);
        return result;
    }
}
