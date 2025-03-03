package org.example.kunuz.model;

import jakarta.persistence.*;

@Entity
public class CommentLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Profile profile_id;
    @OneToOne
    private Comment comment_id;
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String status;

    public CommentLike(Integer id, Profile profile_id, Comment comment_id, String created_date, String status) {
        this.id = id;
        this.profile_id = profile_id;
        this.comment_id = comment_id;
        this.created_date = created_date;
        this.status = status;
    }

    public CommentLike() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Profile getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(Profile profile_id) {
        this.profile_id = profile_id;
    }

    public Comment getComment_id() {
        return comment_id;
    }

    public void setComment_id(Comment comment_id) {
        this.comment_id = comment_id;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CommentLike{" +
                "id=" + id +
                ", profile_id=" + profile_id +
                ", comment_id=" + comment_id +
                ", created_date='" + created_date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
