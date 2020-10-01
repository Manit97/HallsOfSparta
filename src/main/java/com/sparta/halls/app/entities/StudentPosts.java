package com.sparta.halls.app.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "student_posts", schema = "sparta_rooms")
public class StudentPosts {
    private int postId;
    private Integer studentId;
    private String postHeader;
    private String postContent;
    private Timestamp postDateTime;
    private Student student;

    @OneToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
    @Column(name = "student_id")
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
    @Column(name = "post_content")
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Basic
    @Column(name = "post_date_time")
    public Timestamp getPostDateTime() {
        return postDateTime;
    }

    public void setPostDateTime(Timestamp postDateTime) {
        this.postDateTime = postDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentPosts that = (StudentPosts) o;

        if (postId != that.postId) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (postHeader != null ? !postHeader.equals(that.postHeader) : that.postHeader != null) return false;
        if (postContent != null ? !postContent.equals(that.postContent) : that.postContent != null) return false;
        if (postDateTime != null ? !postDateTime.equals(that.postDateTime) : that.postDateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (postHeader != null ? postHeader.hashCode() : 0);
        result = 31 * result + (postContent != null ? postContent.hashCode() : 0);
        result = 31 * result + (postDateTime != null ? postDateTime.hashCode() : 0);
        return result;
    }
}
