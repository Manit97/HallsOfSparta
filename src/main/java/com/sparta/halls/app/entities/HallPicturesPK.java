package com.sparta.halls.app.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HallPicturesPK implements Serializable {
    private int pictureId;
    private int hallId;

    @Column(name = "picture_id")
    @Id
    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Column(name = "hall_id")
    @Id
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

        HallPicturesPK that = (HallPicturesPK) o;

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
