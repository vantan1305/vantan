package com.itsol.iternphamvantan.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "mat_hang")
public class MatHangBO {
    @Id
    @Column(name = "mat_hang")
    private Integer matHang;

    @Column(name = "ten_hang")
    private String tenHang;

    @Column(name = "ma_cong_ty")
    private Integer maCongTy;

    @Column(name = "ma_loai_hang")
    private Integer maLoaiHang;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "don_vi_tinh")
    private BigDecimal donViTinh;

    @Column(name = "gia_hang")
    private BigDecimal giaHang;

    public MatHangBO() {
        super();
    }

    public Integer getMatHang() {
        return matHang;
    }

    public void setMatHang(Integer matHang) {
        this.matHang = matHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public Integer getMaCongTy() {
        return maCongTy;
    }

    public void setMaCongTy(Integer maCongTy) {
        this.maCongTy = maCongTy;
    }

    public Integer getMaLoaiHang() {
        return maLoaiHang;
    }

    public void setMaLoaiHang(Integer maLoaiHang) {
        this.maLoaiHang = maLoaiHang;
    }

    public Integer getLoaiHang() {
        return soLuong;
    }

    public void setLoaiHang(Integer loaiHang) {
        this.soLuong = loaiHang;
    }

    public BigDecimal getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(BigDecimal donViTinh) {
        this.donViTinh = donViTinh;
    }

    public BigDecimal getGiaHang() {
        return giaHang;
    }

    public void setGiaHang(BigDecimal giaHang) {
        this.giaHang = giaHang;
    }
}
