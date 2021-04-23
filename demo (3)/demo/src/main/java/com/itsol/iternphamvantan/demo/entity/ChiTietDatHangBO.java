package com.itsol.iternphamvantan.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "chi_tiet_dat_hang")
public class ChiTietDatHangBO {

    @Id
    @Column(name = "so_hoa_don")
    private Integer soHoaDon;

    @Column(name = "ma_hang")
    private Integer maHang;

    @Column(name = "gia_ban")
    private BigDecimal giaBan;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "muc_gian_gia")
    private Float mucGiamGia;

    public ChiTietDatHangBO() {
        super();
    }

    public Integer getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(Integer soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public Integer getMaHang() {
        return maHang;
    }

    public void setMaHang(Integer maHang) {
        this.maHang = maHang;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Float getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(Float mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }
}
