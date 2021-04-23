package com.itsol.iternphamvantan.demo.dto;

import java.util.Date;

public class DonDatHangDTO {
    private Integer soHoaDon;
    private String maKhachHang;
    private String maNhanVien;
    private Date ngayDatHang;
    private  Date ngayGiaoHang;
    private  Date ngayChuyenHang;
    private  String noiGiaoHang;



    public Integer getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(Integer soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public Date getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Date ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public Date getNgayChuyenHang() {
        return ngayChuyenHang;
    }

    public void setNgayChuyenHang(Date ngayChuyenHang) {
        this.ngayChuyenHang = ngayChuyenHang;
    }

    public String getNoiGiaoHang() {
        return noiGiaoHang;
    }

    public void setNoiGiaoHang(String noiGiaoHang) {
        this.noiGiaoHang = noiGiaoHang;
    }
}
