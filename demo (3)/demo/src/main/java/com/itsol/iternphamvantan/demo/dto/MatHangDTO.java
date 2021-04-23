package com.itsol.iternphamvantan.demo.dto;


import java.math.BigDecimal;

public class MatHangDTO {
    private Integer matHang;
    private String tenHang;
    private Integer maCongTy;
    private Integer maLoaiHang;
    private Integer soLuong;
    private BigDecimal donViTinh;
    private BigDecimal giaHang;



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

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
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
