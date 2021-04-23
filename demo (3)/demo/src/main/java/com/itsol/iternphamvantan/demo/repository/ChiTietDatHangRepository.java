package com.itsol.iternphamvantan.demo.repository;

import com.itsol.iternphamvantan.demo.dto.ChiTietDatHangDTO;
import com.itsol.iternphamvantan.demo.entity.ChiTietDatHangBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChiTietDatHangRepository extends JpaRepository<ChiTietDatHangBO, Integer> {
}
