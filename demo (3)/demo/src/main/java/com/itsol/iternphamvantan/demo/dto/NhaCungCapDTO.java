package com.itsol.iternphamvantan.demo.dto;

public class NhaCungCapDTO {
    private Integer maCongTy;
    private String tenCongTy;
    private String tenGiaoDich;
    private String diaChi;
    private String dienThoai;
    private String fax;
    private String email;

    public NhaCungCapDTO() {
        super();
    }



    public Integer getMaCongTy() {
        return maCongTy;
    }

    public void setMaCongTy(Integer maCongTy) {
        this.maCongTy = maCongTy;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getTenGiaoDich() {
        return tenGiaoDich;
    }

    public void setTenGiaoDich(String tenGiaoDich) {
        this.tenGiaoDich = tenGiaoDich;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
