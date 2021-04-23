package com.itsol.iternphamvantan.demo.Service;

import com.itsol.iternphamvantan.demo.dto.DonDatHangDTO;
import com.itsol.iternphamvantan.demo.dto.LoaiHangDTO;
import com.itsol.iternphamvantan.demo.entity.DonDatHangBO;
import com.itsol.iternphamvantan.demo.entity.LoaiHangBO;
import com.itsol.iternphamvantan.demo.mapper.DonDatHangMapper;
import com.itsol.iternphamvantan.demo.mapper.LoaiHangMapper;
import com.itsol.iternphamvantan.demo.repository.DonDatHangRepository;
import com.itsol.iternphamvantan.demo.repository.LoaiHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonDatHangService {

    @Autowired
    private DonDatHangRepository donDatHangRepository;
    @Autowired
    private DonDatHangMapper donDatHangMapper;

    public List<DonDatHangDTO> getEmployees(){
        List<DonDatHangBO> bos = donDatHangRepository.findAll();
        return donDatHangMapper.toDto(bos);

    }
}
