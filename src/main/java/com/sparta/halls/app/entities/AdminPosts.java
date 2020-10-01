package com.sparta.halls.app.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "admin_posts", schema = "sparta_rooms")
@IdClass(AdminPostsPK.class)
public class AdminPosts {
    private int postId;
    private int adminId;
    private LocalDateTime dateAssigned;

    Admins admin;
    Noticeboard post;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="admin_id", insertable = false, updatable = false)
    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin=admin;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="post_id", insertable = false, updatable = false)
    public Noticeboard getPost() {
        return post;
    }

    public void setPost(Noticeboard post) {
        this.post = post;
    }

    @Id
    @Column(name = "post_id")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Id
    @Column(name = "admin_id")
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "date_assigned")
    public LocalDateTime getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(LocalDateTime dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminPosts that = (AdminPosts) o;

        if (postId != that.postId) return false;
        if (adminId != that.adminId) return false;
        if (dateAssigned != null ? !dateAssigned.equals(that.dateAssigned) : that.dateAssigned != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + (adminId);
        result = 31 * result + (dateAssigned != null ? dateAssigned.hashCode() : 0);
        return result;
    }
}
