package org.example.kunuz.dto;

import jakarta.persistence.Column;

public class EmailHistoryDto {
    @Column(nullable = false)
    private String message;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String created_data;

    public EmailHistoryDto(String message, String email, String created_data) {
        this.message = message;
        this.email = email;
        this.created_data = created_data;
    }

    public EmailHistoryDto() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_data() {
        return created_data;
    }

    public void setCreated_data(String created_data) {
        this.created_data = created_data;
    }

    @Override
    public String toString() {
        return "EmailHistoryDto{" +
                "message='" + message + '\'' +
                ", email='" + email + '\'' +
                ", created_data='" + created_data + '\'' +
                '}';
    }
}
