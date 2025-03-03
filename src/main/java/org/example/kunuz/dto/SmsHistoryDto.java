package org.example.kunuz.dto;

import jakarta.persistence.Column;

public class SmsHistoryDto {
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

    public SmsHistoryDto(String phone, String message, String status, String type, String created_date) {
        this.phone = phone;
        this.message = message;
        this.status = status;
        this.type = type;
        this.created_date = created_date;
    }

    public SmsHistoryDto() {
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

    @Override
    public String toString() {
        return "SmsHistoryDto{" +
                "phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", created_date='" + created_date + '\'' +
                '}';
    }
}
