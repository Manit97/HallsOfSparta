package com.sparta.halls.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "hall_pictures", schema = "sparta_rooms", catalog = "")
@IdClass(HallPicturesPK.class)
public class HallPictures {
    private int pictureId;
    private int hallId;

    Halls hall;
    Pictures picture;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="picture_id", insertable = false, updatable = false)
    public Pictures getPicture() {
        return picture;
    }

    public void setPicture(Pictures picture) {
        this.picture =picture;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="hall_id", insertable = false, updatable = false)
    public Halls getHall() {
        return hall;
    }

    public void setHall(Halls hall){
        this.hall=hall;
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
    @Column(name = "hall_id")
    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HallPictures that = (HallPictures) o;

        if (pictureId != that.pictureId) return false;
        if (hallId != that.hallId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pictureId;
        result = 31 * result + hallId;
        return result;
    }
}
