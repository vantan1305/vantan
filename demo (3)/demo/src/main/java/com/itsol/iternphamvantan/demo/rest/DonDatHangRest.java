package com.itsol.iternphamvantan.demo.rest;

import com.itsol.iternphamvantan.demo.Service.DonDatHangService;
import com.itsol.iternphamvantan.demo.Service.KhachHangService;
import com.itsol.iternphamvantan.demo.dto.DonDatHangDTO;
import com.itsol.iternphamvantan.demo.dto.KhachHangDTO;
import com.itsol.iternphamvantan.demo.mapper.DonDatHangMapper;
import com.itsol.iternphamvantan.demo.mapper.KhachHangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class DonDatHangRest {
    @Autowired
    private DonDatHangService donDatHangService;
    @Autowired
    private DonDatHangMapper donDatHangMapper;

    @GetMapping("/nhacungcap-get-all")
    public ResponseEntity<List<DonDatHangDTO>> getAllDonDatHang() {
        List<DonDatHangDTO> dataResponse = donDatHangService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }
}
