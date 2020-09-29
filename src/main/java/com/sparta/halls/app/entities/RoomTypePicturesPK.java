package com.sparta.halls.app.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class RoomTypePicturesPK implements Serializable {
    private int pictureId;
    private String roomTypeId;

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
    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoomTypePicturesPK that = (RoomTypePicturesPK) o;

        if (pictureId != that.pictureId) return false;
        if (roomTypeId != null ? !roomTypeId.equals(that.roomTypeId) : that.roomTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pictureId;
        result = 31 * result + (roomTypeId != null ? roomTypeId.hashCode() : 0);
        return result;
    }
}
