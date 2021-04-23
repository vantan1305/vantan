package com.itsol.iternphamvantan.demo.Service;

import com.itsol.iternphamvantan.demo.dao.NhanVienCuaHangDAO;
import com.itsol.iternphamvantan.demo.dto.NhanVienCuaHangDTO;
import com.itsol.iternphamvantan.demo.entity.NhanVienCuaHangBO;
import com.itsol.iternphamvantan.demo.mapper.NhanVienCuaHangMapper;
import com.itsol.iternphamvantan.demo.repository.NhanVienCuaHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienCuaHangService {

    @Autowired
    private NhanVienCuaHangRepository nhanVienCuaHangRepository;
    @Autowired
    private NhanVienCuaHangMapper nhanVienCuaHangMapper;
    @Autowired
    private NhanVienCuaHangDAO nhanVienCuaHangDAO;

    public List<NhanVienCuaHangDTO> getEmpNotSales(){
        return nhanVienCuaHangDAO.getEmployeeNotSales();
    }

    public List<NhanVienCuaHangDTO> getEmployees() {
        List<NhanVienCuaHangBO> bos = nhanVienCuaHangRepository.findAll();
        return nhanVienCuaHangMapper.toDto(bos);
    }
}
