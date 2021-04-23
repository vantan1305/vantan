package com.itsol.iternphamvantan.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loai_hang")
public class LoaiHangBO {

    @Id
    @Column(name = "ma_loai_hang")
    private Integer maLoaiHang;

    @Column(name = "ten_loai_hang")
    private String tenLoaiHang;

    public LoaiHangBO() {
        super();
    }

    public Integer getMaLoaiHang() {
        return maLoaiHang;
    }

    public void setMaLoaiHang(Integer maLoaiHang) {
        this.maLoaiHang = maLoaiHang;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }
}
