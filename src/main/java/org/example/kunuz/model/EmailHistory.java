package org.example.kunuz.model;

import jakarta.persistence.*;

@Entity
public class EmailHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String message;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String created_data;

    public EmailHistory(Integer id, String message, String email, String created_data) {
        this.id = id;
        this.message = message;
        this.email = email;
        this.created_data = created_data;
    }

    public EmailHistory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "EmailHistory{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", email='" + email + '\'' +
                ", created_data='" + created_data + '\'' +
                '}';
    }
}
