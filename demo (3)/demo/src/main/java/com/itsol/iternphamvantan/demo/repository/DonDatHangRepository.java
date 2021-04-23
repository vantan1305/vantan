package com.itsol.iternphamvantan.demo.repository;

import com.itsol.iternphamvantan.demo.dto.DonDatHangDTO;
import com.itsol.iternphamvantan.demo.entity.DonDatHangBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonDatHangRepository extends JpaRepository<DonDatHangBO, Integer> {
}
