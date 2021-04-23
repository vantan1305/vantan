package com.itsol.iternphamvantan.demo.Service;

import com.itsol.iternphamvantan.demo.dto.KhachHangDTO;
import com.itsol.iternphamvantan.demo.dto.LoaiHangDTO;
import com.itsol.iternphamvantan.demo.dto.MatHangDTO;
import com.itsol.iternphamvantan.demo.entity.KhachHangBO;
import com.itsol.iternphamvantan.demo.entity.LoaiHangBO;
import com.itsol.iternphamvantan.demo.entity.MatHangBO;
import com.itsol.iternphamvantan.demo.mapper.KhachHangMapper;
import com.itsol.iternphamvantan.demo.mapper.LoaiHangMapper;
import com.itsol.iternphamvantan.demo.mapper.MatHangMapper;
import com.itsol.iternphamvantan.demo.repository.KhachHangRepository;
import com.itsol.iternphamvantan.demo.repository.LoaiHangRepository;
import com.itsol.iternphamvantan.demo.repository.MatHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;
    @Autowired
    private KhachHangMapper khachHangMapper;

    public List<KhachHangDTO> getEmployees(){
        List<KhachHangBO> bos = khachHangRepository.findAll();
        return khachHangMapper.toDto(bos);

    }
}
