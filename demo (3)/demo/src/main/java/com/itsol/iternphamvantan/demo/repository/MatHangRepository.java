package com.itsol.iternphamvantan.demo.repository;

import com.itsol.iternphamvantan.demo.dto.MatHangDTO;
import com.itsol.iternphamvantan.demo.entity.MatHangBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatHangRepository extends JpaRepository<MatHangBO,Integer> {
}
