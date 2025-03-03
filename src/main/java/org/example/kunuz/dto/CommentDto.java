package org.example.kunuz.dto;

import jakarta.persistence.Column;

public class CommentDto {
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String updated_date;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String reply_id;
    @Column(nullable = false)
    private String visible;

    public CommentDto(String created_date, String updated_date, String content, String reply_id, String visible) {
        this.created_date = created_date;
        this.updated_date = updated_date;
        this.content = content;
        this.reply_id = reply_id;
        this.visible = visible;
    }

    public CommentDto() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "CommentDto{" +
                "created_date='" + created_date + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", content='" + content + '\'' +
                ", reply_id='" + reply_id + '\'' +
                ", visible='" + visible + '\'' +
                '}';
    }
}
