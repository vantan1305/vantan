package com.itsol.iternphamvantan.demo.dto;

import javax.persistence.Column;
import java.math.BigDecimal;

public class NhanVienCuaHangDTO {
    private Integer nhanVien;

    private String Ho;

    private String Ten;

    private String ngaySinh;

    private String ngayLamViec;

    private String diaChi;

    private String dienThoai;

    private BigDecimal luongCoBan;

    private BigDecimal phuCap;

    public NhanVienCuaHangDTO(Integer nhanVien, String ho, String ten) {
        this.nhanVien = nhanVien;
        Ho = ho;
        Ten = ten;
    }

    public NhanVienCuaHangDTO() {

    }

    public Integer getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(Integer nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String ho) {
        Ho = ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(String ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public BigDecimal getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(BigDecimal luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public BigDecimal getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(BigDecimal phuCap) {
        this.phuCap = phuCap;
    }

}
