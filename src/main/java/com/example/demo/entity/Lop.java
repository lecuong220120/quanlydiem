package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lop")
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tenlop")
    private String tenLop;

    @OneToMany(mappedBy = "lop")
    @JsonIgnore
    private List<SinhVien> listSinhVien;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public void setListSinhVien(List<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }
}
