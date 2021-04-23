package com.itsol.iternphamvantan.demo.rest;

import com.itsol.iternphamvantan.demo.Service.LoaiHangService;
import com.itsol.iternphamvantan.demo.dto.LoaiHangDTO;
import com.itsol.iternphamvantan.demo.mapper.LoaiHangMapper;
import com.itsol.iternphamvantan.demo.mapper.NhaCungCapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class LoaiHangRest {

    @Autowired
    private LoaiHangService loaiHangService;
    @Autowired
    private LoaiHangMapper loaiHangMapper;

    @GetMapping("/nhacungcap-get-all")
    public ResponseEntity<List<LoaiHangDTO>> getAllLoaiHang() {
        List<LoaiHangDTO> dataResponse = loaiHangService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }
}
