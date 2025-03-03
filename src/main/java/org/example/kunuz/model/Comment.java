package org.example.kunuz.model;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String updated_date;
    @OneToOne
    private Profile profile_id;
    @Column(nullable = false)
    private String content;
    @OneToOne
    private Article article_id;
    @Column(nullable = false)
    private String reply_id;
    @Column(nullable = false)
    private String visible;

    public Comment(Integer id, String created_date, String updated_date, Profile profile_id, String content, Article article_id, String reply_id, String visible) {
        this.id = id;
        this.created_date = created_date;
        this.updated_date = updated_date;
        this.profile_id = profile_id;
        this.content = content;
        this.article_id = article_id;
        this.reply_id = reply_id;
        this.visible = visible;
    }

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public Profile getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(Profile profile_id) {
        this.profile_id = profile_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Article getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Article article_id) {
        this.article_id = article_id;
    }

    public String getReply_id() {
        return reply_id;
    }

    public void setReply_id(String reply_id) {
        this.reply_id = reply_id;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", created_date='" + created_date + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", profile_id=" + profile_id +
                ", content='" + content + '\'' +
                ", article_id=" + article_id +
                ", reply_id='" + reply_id + '\'' +
                ", visible='" + visible + '\'' +
                '}';
    }
}
