package org.example.kunuz.dto;

import jakarta.persistence.Column;

public class CommentLikeDto {
    @Column(nullable = false)
    private String created_date;
    @Column(nullable = false)
    private String status;

    public CommentLikeDto(String created_date, String status) {
        this.created_date = created_date;
        this.status = status;
    }

    public CommentLikeDto() {
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
        return "CommentLikeDto{" +
                "created_date='" + created_date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
