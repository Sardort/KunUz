package org.example.kunuz.dto;

import jakarta.persistence.Column;

public class AttachDto {
    @Column(nullable = false)
    private String original_name;
    @Column(nullable = false)
    private String path;
    @Column(nullable = false)
    private String size;
    @Column(nullable = false)
    private String extension;
    @Column(nullable = false)
    private String created_date;

    public AttachDto(String original_name, String path, String size, String extension, String created_date) {
        this.original_name = original_name;
        this.path = path;
        this.size = size;
        this.extension = extension;
        this.created_date = created_date;
    }

    public AttachDto() {
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "AttachDto{" +
                "original_name='" + original_name + '\'' +
                ", path='" + path + '\'' +
                ", size='" + size + '\'' +
                ", extension='" + extension + '\'' +
                ", created_date='" + created_date + '\'' +
                '}';
    }
}
