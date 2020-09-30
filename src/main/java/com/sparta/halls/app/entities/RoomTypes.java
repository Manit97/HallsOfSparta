package com.sparta.halls.app.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "room_types", schema = "sparta_rooms", catalog = "")
public class RoomTypes {
    private int roomTypeId;
    private String roomType;
    private String roomDescription;
    private String roomSize;
    private BigDecimal price;
    private Set<RoomTypePictures> roomTypePictures = new HashSet<>();

    @OneToMany(mappedBy = "roomType")
    public Set<RoomTypePictures> getRoomTypePictures() {
        return roomTypePictures;
    }

    public void setRoomTypePictures(Set<RoomTypePictures> roomTypePictures) {
        this.roomTypePictures = roomTypePictures;
    }

    @Id
    @Column(name = "room_type_id")
    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Basic
    @Column(name = "room_type")
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Basic
    @Column(name = "room_description")
    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    @Basic
    @Column(name = "room_size")
    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoomTypes roomTypes = (RoomTypes) o;

        if (roomTypeId != roomTypes.roomTypeId) return false;
        if (roomType != null ? !roomType.equals(roomTypes.roomType) : roomTypes.roomType != null) return false;
        if (roomDescription != null ? !roomDescription.equals(roomTypes.roomDescription) : roomTypes.roomDescription != null)
            return false;
        if (roomSize != null ? !roomSize.equals(roomTypes.roomSize) : roomTypes.roomSize != null) return false;
        if (price != null ? !price.equals(roomTypes.price) : roomTypes.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roomTypeId;
        result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
        result = 31 * result + (roomDescription != null ? roomDescription.hashCode() : 0);
        result = 31 * result + (roomSize != null ? roomSize.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
