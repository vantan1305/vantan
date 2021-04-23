package com.itsol.iternphamvantan.demo.entity;

import com.itsol.iternphamvantan.demo.dto.NhanVienCuaHangDTO;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "nhan_vien_cua_hang")
@SqlResultSetMapping(
        name = "emp_not_sales_mapping",
        classes = {
                @ConstructorResult(
                        targetClass = NhanVienCuaHangDTO.class,
                        columns = {
                                @ColumnResult(name = "nhan_vien", type = Integer.class),
                                @ColumnResult(name = "ho", type = String.class),
                                @ColumnResult(name = "ten", type = String.class),
                        }
                )
        }
)
public class NhanVienCuaHangBO {
    @Id
    @Column(name = "nhan_vien")
    private Integer nhanVien;

    @Column(name = "ho")
    private String Ho;

    @Column(name = "ten")
    private String Ten;

    @Column(name = "ngay_sinh")
    private String ngaySinh;

    @Column(name = "ngay_lam_viec")
    private String ngayLamViec;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "dien_thoai")
    private String dienThoai;

    @Column(name = "luong_co_ban")
    private BigDecimal luongCoBan;

    @Column(name = "phu_cap")
    private BigDecimal phuCap;

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
