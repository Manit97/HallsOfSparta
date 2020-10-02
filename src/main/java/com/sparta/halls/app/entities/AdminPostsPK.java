package com.sparta.halls.app.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AdminPostsPK implements Serializable {
    private int postId;
    private int adminId;

    @Column(name = "post_id")
    @Id
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Column(name = "admin_id")
    @Id
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminPostsPK that = (AdminPostsPK) o;

        if (postId != that.postId) return false;
        if (adminId != that.adminId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + (adminId);
        return result;
    }
}
