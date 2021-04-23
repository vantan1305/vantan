package com.itsol.iternphamvantan.demo.repository;

import com.itsol.iternphamvantan.demo.dto.KhachHangDTO;
import com.itsol.iternphamvantan.demo.entity.KhachHangBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<KhachHangBO, Integer> {
}
