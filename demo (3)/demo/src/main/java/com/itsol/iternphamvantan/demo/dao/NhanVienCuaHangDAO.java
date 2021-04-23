package com.itsol.iternphamvantan.demo.dao;

import com.itsol.iternphamvantan.demo.dto.NhanVienCuaHangDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class NhanVienCuaHangDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<NhanVienCuaHangDTO> getEmployeeNotSales() {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT ");
        sql.append("    nvch.nhan_vien, ");
        sql.append("    nvch.ho, ");
        sql.append("    nvch.ten ");
        sql.append(" FROM nhan_vien_cua_hang nvch ");
        sql.append(" WHERE NOT EXISTS ( SELECT ddh.ma_nhan_vien FROM don_dat_hang ddh WHERE nvch.nhan_vien = ddh.ma_nhan_vien ) ");

        Query query = entityManager.createNativeQuery(sql.toString(), "emp_not_sales_mapping");
        return query.getResultList();
    }
}
