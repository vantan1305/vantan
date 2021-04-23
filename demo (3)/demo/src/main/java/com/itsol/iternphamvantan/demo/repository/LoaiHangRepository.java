package com.itsol.iternphamvantan.demo.repository;

import com.itsol.iternphamvantan.demo.dto.LoaiHangDTO;
import com.itsol.iternphamvantan.demo.entity.LoaiHangBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaiHangRepository extends JpaRepository<LoaiHangBO, Integer> {
}
