package com.itsol.iternphamvantan.demo.dao;

import com.itsol.iternphamvantan.demo.dto.NhanVienCuaHangDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class NhaCungCapDAO {

    @PersistenceContext
    private EntityManager entityManager;


}
