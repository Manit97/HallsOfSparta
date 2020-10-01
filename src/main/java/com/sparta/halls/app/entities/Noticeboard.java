package com.sparta.halls.app.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Noticeboard {
    private int postId;
    private Integer adminId;
    private String postHeader;
    private LocalDateTime postDateTime;
    private String postContent;
    private String urgency;
    private Set<AdminPosts> adminPosts;

    @OneToMany(mappedBy = "post")
    public Set<AdminPosts> getAdminPosts() {
        return adminPosts;
    }

    public void setAdminPosts(Set<AdminPosts> adminPosts) {
        this.adminPosts = adminPosts;
    }

    @Id
    @Column(name = "post_id")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "admin_id")
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "post_header")
    public String getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(String postHeader) {
        this.postHeader = postHeader;
    }

    @Basic
    @Column(name = "post_date_time")
    public LocalDateTime getPostDateTime() {
        return postDateTime;
    }

    public void setPostDateTime(LocalDateTime postDateTime) {
        this.postDateTime = postDateTime;
    }

    @Basic
    @Column(name = "post_content")
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Basic
    @Column(name = "urgency")
    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Noticeboard that = (Noticeboard) o;

        if (postId != that.postId) return false;
        if (adminId != null ? !adminId.equals(that.adminId) : that.adminId != null) return false;
        if (postHeader != null ? !postHeader.equals(that.postHeader) : that.postHeader != null) return false;
        if (postDateTime != null ? !postDateTime.equals(that.postDateTime) : that.postDateTime != null) return false;
        if (postContent != null ? !postContent.equals(that.postContent) : that.postContent != null) return false;
        if (urgency != null ? !urgency.equals(that.urgency) : that.urgency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + (adminId != null ? adminId.hashCode() : 0);
        result = 31 * result + (postHeader != null ? postHeader.hashCode() : 0);
        result = 31 * result + (postDateTime != null ? postDateTime.hashCode() : 0);
        result = 31 * result + (postContent != null ? postContent.hashCode() : 0);
        result = 31 * result + (urgency != null ? urgency.hashCode() : 0);
        return result;
    }
}
