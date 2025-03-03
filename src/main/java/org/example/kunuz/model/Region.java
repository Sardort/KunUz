package org.example.kunuz.model;

import jakarta.persistence.*;

@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String order_number;
    @Column(nullable = false)
    private String name_uz;
    @Column(nullable = false)
    private String name_ru;
    @Column(nullable = false)
    private String name_en;
    @Column(nullable = false)
    private String visible;
    @Column(nullable = false)
    private String created_date;

    public Region(Integer id, String order_number, String name_uz, String name_ru, String name_en, String visible, String created_date) {
        this.id = id;
        this.order_number = order_number;
        this.name_uz = name_uz;
        this.name_ru = name_ru;
        this.name_en = name_en;
        this.visible = visible;
        this.created_date = created_date;
    }

    public Region() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getName_uz() {
        return name_uz;
    }

    public void setName_uz(String name_uz) {
        this.name_uz = name_uz;
    }

    public String getName_ru() {
        return name_ru;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", order_number='" + order_number + '\'' +
                ", name_uz='" + name_uz + '\'' +
                ", name_ru='" + name_ru + '\'' +
                ", name_en='" + name_en + '\'' +
                ", visible='" + visible + '\'' +
                ", created_date='" + created_date + '\'' +
                '}';
    }
}
