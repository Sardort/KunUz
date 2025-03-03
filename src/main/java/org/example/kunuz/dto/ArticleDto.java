package org.example.kunuz.dto;

import jakarta.persistence.Column;

public class ArticleDto {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String shared_count;
    @Column(nullable = false)
    private String image_id;
    @Column(nullable = false)
    private String moderator_id;
    @Column(nullable = false)
    private String publisher_id;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String published_date;
    @Column(nullable = false)
    private String visible;
    @Column(nullable = false)
    private String view_count;

    public ArticleDto(String title, String description, String content, String shared_count, String image_id, String moderator_id, String publisher_id, String status, String created_date, String published_date, String visible, String view_count) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.shared_count = shared_count;
        this.image_id = image_id;
        this.moderator_id = moderator_id;
        this.publisher_id = publisher_id;
        this.status = status;
        this.created_date = created_date;
        this.published_date = published_date;
        this.visible = visible;
        this.view_count = view_count;
    }

    public ArticleDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShared_count() {
        return shared_count;
    }

    public void setShared_count(String shared_count) {
        this.shared_count = shared_count;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getModerator_id() {
        return moderator_id;
    }

    public void setModerator_id(String moderator_id) {
        this.moderator_id = moderator_id;
    }

    public String getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(String publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getView_count() {
        return view_count;
    }

    public void setView_count(String view_count) {
        this.view_count = view_count;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", shared_count='" + shared_count + '\'' +
                ", image_id='" + image_id + '\'' +
                ", moderator_id='" + moderator_id + '\'' +
                ", publisher_id='" + publisher_id + '\'' +
                ", status='" + status + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", visible='" + visible + '\'' +
                ", view_count='" + view_count + '\'' +
                '}';
    }
}
