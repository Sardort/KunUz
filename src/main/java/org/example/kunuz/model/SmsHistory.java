package org.example.kunuz.model;

import jakarta.persistence.*;
import org.example.kunuz.model.entity.StatusSmsRole;

@Entity
public class SmsHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(nullable = false)
    private String message;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String created_date;
    @Enumerated(EnumType.STRING)
    private StatusSmsRole statusSmsRole;

    public SmsHistory(Integer id, String phone, String message, String status, String type, String created_date, StatusSmsRole statusSmsRole) {
        this.id = id;
        this.phone = phone;
        this.message = message;
        this.status = status;
        this.type = type;
        this.created_date = created_date;
        this.statusSmsRole = statusSmsRole;
    }

    public SmsHistory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public StatusSmsRole getStatusSmsRole() {
        return statusSmsRole;
    }

    public void setStatusSmsRole(StatusSmsRole statusSmsRole) {
        this.statusSmsRole = statusSmsRole;
    }

    @Override
    public String toString() {
        return "SmsHistory{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", created_date='" + created_date + '\'' +
                ", statusSmsRole=" + statusSmsRole +
                '}';
    }
}
