package com.sparta.halls.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "public_rooms", schema = "sparta_rooms", catalog = "")
public class PublicRooms {
    private int publicRoomId;
    private String publicRoomName;

    @Id
    @Column(name = "public_room_id")
    public int getPublicRoomId() {
        return publicRoomId;
    }

    public void setPublicRoomId(int publicRoomId) {
        this.publicRoomId = publicRoomId;
    }

    @Basic
    @Column(name = "public_room_name")
    public String getPublicRoomName() {
        return publicRoomName;
    }

    public void setPublicRoomName(String publicRoomName) {
        this.publicRoomName = publicRoomName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublicRooms that = (PublicRooms) o;

        if (publicRoomId != that.publicRoomId) return false;
        if (publicRoomName != null ? !publicRoomName.equals(that.publicRoomName) : that.publicRoomName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = publicRoomId;
        result = 31 * result + (publicRoomName != null ? publicRoomName.hashCode() : 0);
        return result;
    }
}
