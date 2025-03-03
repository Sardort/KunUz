package org.example.kunuz.model;

import jakarta.persistence.*;

@Entity
public class ArticleLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Profile profile_id;
    @OneToOne
    private Article article_id;
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String status;

    public ArticleLike(Integer id, Profile profile_id, Article article_id, String created_date, String status) {
        this.id = id;
        this.profile_id = profile_id;
        this.article_id = article_id;
        this.created_date = created_date;
        this.status = status;
    }

    public ArticleLike() {
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

    public Article getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Article article_id) {
        this.article_id = article_id;
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
        return "ArticleLike{" +
                "id=" + id +
                ", profile_id=" + profile_id +
                ", article_id=" + article_id +
                ", created_date='" + created_date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
