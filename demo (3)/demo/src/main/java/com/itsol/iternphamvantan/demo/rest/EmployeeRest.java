package com.itsol.iternphamvantan.demo.rest;

import com.itsol.iternphamvantan.demo.Service.NhanVienCuaHangService;
import com.itsol.iternphamvantan.demo.dto.NhanVienCuaHangDTO;
import com.itsol.iternphamvantan.demo.mapper.NhanVienCuaHangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRest {

    @Autowired
    private NhanVienCuaHangService nhanVienCuaHangService;

    @Autowired
    private NhanVienCuaHangMapper nhanVienCuaHangMapper;


    @GetMapping("/employess")
    public ResponseEntity<List<NhanVienCuaHangDTO>> getEmployees() {
        List<NhanVienCuaHangDTO> dataResponse = nhanVienCuaHangService.getEmployees();
        return ResponseEntity.ok(dataResponse);
    }

    @GetMapping("/employees-not-sales")
    public ResponseEntity<List<NhanVienCuaHangDTO>> getEmpNotSales() {
        List<NhanVienCuaHangDTO> dataResponse = nhanVienCuaHangService.getEmpNotSales();
        return ResponseEntity.ok(dataResponse);
    }

//    @PostMapping("/add-employee")
//    public ResponseEntity<NhanVienCuaHangDTO> addEmployee(@RequestBody NhanVienCuaHangDTO nhanVienDTO) {
//        System.out.println(nhanVienDTO);
//
//        return ResponseEntity.ok(nhanVienDTO);
//    }
//
//
//    @GetMapping("/employee/{nhan_vien}")
//    public ResponseEntity<String> getEmployees(@PathVariable String nhanVien, @RequestParam(required = false) String requestParam) {
//
//        System.out.println("pathVariableNhanVien = " + nhanVien);
//        System.out.println("requestParam = " + requestParam);
//
//        return ResponseEntity.ok("OK");
//    }
}
