package org.example.kunuz.dto;

import jakarta.persistence.Column;

public class SavedArticleDto {
    @Column(nullable = false)
    private String created_date;

    public SavedArticleDto(String created_date) {
        this.created_date = created_date;
    }

    public SavedArticleDto() {
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "SavedArticleDto{" +
                "created_date='" + created_date + '\'' +
                '}';
    }
}