package com.itsol.iternphamvantan.demo.rest;

import com.itsol.iternphamvantan.demo.Service.ChiTietDatHangService;
import com.itsol.iternphamvantan.demo.Service.DonDatHangService;
import com.itsol.iternphamvantan.demo.dto.ChiTietDatHangDTO;
import com.itsol.iternphamvantan.demo.dto.DonDatHangDTO;
import com.itsol.iternphamvantan.demo.mapper.ChiTietDatHangMapper;
import com.itsol.iternphamvantan.demo.mapper.DonDatHangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class ChiTietDatHangRest {
    @Autowired
    private ChiTietDatHangService chiTietDatHangService;
    @Autowired
    private ChiTietDatHangMapper chiTietDatHangMapper;

    @GetMapping("/nhacungcap-get-all")
    public ResponseEntity<List<ChiTietDatHangDTO>> getAllChiTietDatHang() {
        List<ChiTietDatHangDTO> dataResponse = chiTietDatHangService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }
}
