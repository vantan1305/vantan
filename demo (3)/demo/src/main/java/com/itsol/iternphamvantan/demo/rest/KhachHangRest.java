package com.itsol.iternphamvantan.demo.rest;

import com.itsol.iternphamvantan.demo.Service.KhachHangService;
import com.itsol.iternphamvantan.demo.Service.NhaCungCapService;
import com.itsol.iternphamvantan.demo.dto.KhachHangDTO;
import com.itsol.iternphamvantan.demo.dto.NhaCungCapDTO;
import com.itsol.iternphamvantan.demo.mapper.KhachHangMapper;
import com.itsol.iternphamvantan.demo.mapper.NhaCungCapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class KhachHangRest {
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private KhachHangMapper khachHangMapper;

    @GetMapping("/nhacungcap-get-all")
    public ResponseEntity<List<KhachHangDTO>> getAllKhachHang() {
        List<KhachHangDTO> dataResponse = khachHangService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }
}
