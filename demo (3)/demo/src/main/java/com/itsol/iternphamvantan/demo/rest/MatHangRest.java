package com.itsol.iternphamvantan.demo.rest;

import com.itsol.iternphamvantan.demo.Service.MatHangService;
import com.itsol.iternphamvantan.demo.Service.NhaCungCapService;
import com.itsol.iternphamvantan.demo.dto.MatHangDTO;
import com.itsol.iternphamvantan.demo.dto.NhaCungCapDTO;
import com.itsol.iternphamvantan.demo.mapper.MatHangMapper;
import com.itsol.iternphamvantan.demo.mapper.NhaCungCapMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class MatHangRest {

    @Autowired
    private MatHangService matHangService;
    @Autowired
    private MatHangMapper matHangMapper;

    @GetMapping("/nhacungcap-get-all")
    public ResponseEntity<List<MatHangDTO>> getAllMatHang() {
        List<MatHangDTO> dataResponse = matHangService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }
}
