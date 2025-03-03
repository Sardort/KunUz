package org.example.kunuz.model;

import jakarta.persistence.*;
import org.example.kunuz.model.entity.StatusRole;

import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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
    @OneToMany
    private List<Region> region_id;
    @OneToMany
    private List<Category> category_id;
    @Column(nullable = false)
    private String moderator_id;
    @Column(nullable = false)
    private String publisher_id;
    @Column(nullable = false)
    private String status;
    @Enumerated (EnumType.STRING)
    private StatusRole statusRole;
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String published_date;
    @Column(nullable = false)
    private String visible;
    @Column(nullable = false)
    private String view_count;

    public Article(Integer id, String title, String description, String content, String shared_count, String image_id, List<Region> region_id, List<Category> category_id, String moderator_id, String publisher_id, String status, StatusRole statusRole, String created_date, String published_date, String visible, String view_count) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.shared_count = shared_count;
        this.image_id = image_id;
        this.region_id = region_id;
        this.category_id = category_id;
        this.moderator_id = moderator_id;
        this.publisher_id = publisher_id;
        this.status = status;
        this.statusRole = statusRole;
        this.created_date = created_date;
        this.published_date = published_date;
        this.visible = visible;
        this.view_count = view_count;
    }

    public Article() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Region> getRegion_id() {
        return region_id;
    }

    public void setRegion_id(List<Region> region_id) {
        this.region_id = region_id;
    }

    public List<Category> getCategory_id() {
        return category_id;
    }

    public void setCategory_id(List<Category> category_id) {
        this.category_id = category_id;
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

    public StatusRole getStatusRole() {
        return statusRole;
    }

    public void setStatusRole(StatusRole statusRole) {
        this.statusRole = statusRole;
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
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", shared_count='" + shared_count + '\'' +
                ", image_id='" + image_id + '\'' +
                ", region_id=" + region_id +
                ", category_id=" + category_id +
                ", moderator_id='" + moderator_id + '\'' +
                ", publisher_id='" + publisher_id + '\'' +
                ", status='" + status + '\'' +
                ", statusRole=" + statusRole +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", visible='" + visible + '\'' +
                ", view_count='" + view_count + '\'' +
                '}';
    }
}
