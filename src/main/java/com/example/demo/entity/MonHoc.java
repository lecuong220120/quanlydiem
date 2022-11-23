package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "monhoc")
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tenmonhoc")
    private String tenMonHoc;
    @Column(name = "sogio")
    private double soGio;

    @ManyToMany
    @JoinTable(name = "DiemThi", joinColumns = @JoinColumn(name = "monhoc_id"), inverseJoinColumns = @JoinColumn(name = "sinhvien_id"))
    private List<SinhVien> listSinhVien;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public double getSoGio() {
        return soGio;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }

}
