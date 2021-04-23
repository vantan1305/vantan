package com.itsol.iternphamvantan.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "don_dat_hang")
public class DonDatHangBO {

    @Id
    @Column(name = "so_hoa_don")
    private Integer soHoaDon;

    @Column(name = "ma_khach_hang")
    private Integer maKhachHang;

    @Column(name = "ma_nhan_vien")
    private Integer maNhanVien;

    @Column(name = "ngay_dat_hang")
    private Date ngayDatHang;

    @Column(name = "ngay_giao_hang")
    private Date ngayGiaoHang;

    @Column(name = "ngay_chuyen_hang")
    private Date ngayChuyenHang;

    @Column(name = "noi_giao_hang")
    private String noiGiaoHang;

    public DonDatHangBO() {
        super();
    }

    public Integer getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(Integer soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
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
