package com.sparta.halls.app.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rooms {
    private int roomId;
    private int hallId;
    private int roomTypeId;
    private int doorNo;

    @Id
    @Column(name = "room_id")
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Basic
    @Column(name = "hall_id")
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    @Basic
    @Column(name = "room_type_id")
    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Basic
    @Column(name = "door_no")
    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rooms rooms = (Rooms) o;

        if (roomId != rooms.roomId) return false;
        if (hallId != rooms.hallId) return false;
        if (roomTypeId != rooms.roomTypeId) return false;
        if (doorNo != rooms.doorNo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roomId;
        result = 31 * result + hallId;
        result = 31 * result + roomTypeId;
        result = 31 * result + doorNo;
        return result;
    }
}
