package com.sparta.halls.app.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class RoomTypePicturesPK implements Serializable {
    private int pictureId;
    private int roomTypeId;

    @Column(name = "picture_id")
    @Id
    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Column(name = "room_type_id")
    @Id
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

        RoomTypePicturesPK that = (RoomTypePicturesPK) o;

        if (pictureId != that.pictureId) return false;
        if (roomTypeId != that.roomTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pictureId;
        result = 31 * result + (roomTypeId);
        return result;
    }
}
