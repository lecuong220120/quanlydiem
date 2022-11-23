package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "tensv")
    private String tenSV;

    @Column(name = "gioitinh")
    private String gioiTinh;

    @Column(name = "ngaySinh")
    private String ngaySinh;

    @ManyToOne
    @JoinColumn(name = "lop_sv_id", nullable = false)
    private Lop lop;
    @ManyToMany(mappedBy = "listSinhVien")
    private List<MonHoc> listMonHoc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

}
