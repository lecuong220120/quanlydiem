package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "diemthi")
public class DiemThi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "solanthi")
    private Integer soLanThi;
    @Column(name = "diemthi")
    private double diemThi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSoLanThi() {
        return soLanThi;
    }

    public void setSoLanThi(Integer soLanThi) {
        this.soLanThi = soLanThi;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

}
