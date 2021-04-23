package com.itsol.iternphamvantan.demo.Service;

import com.itsol.iternphamvantan.demo.dto.ChiTietDatHangDTO;
import com.itsol.iternphamvantan.demo.dto.DonDatHangDTO;
import com.itsol.iternphamvantan.demo.entity.ChiTietDatHangBO;
import com.itsol.iternphamvantan.demo.entity.DonDatHangBO;
import com.itsol.iternphamvantan.demo.mapper.ChiTietDatHangMapper;
import com.itsol.iternphamvantan.demo.mapper.DonDatHangMapper;
import com.itsol.iternphamvantan.demo.repository.ChiTietDatHangRepository;
import com.itsol.iternphamvantan.demo.repository.DonDatHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDatHangService {

    @Autowired
    private ChiTietDatHangRepository chiTietDatHangRepository;
    @Autowired
    private ChiTietDatHangMapper chiTietDatHangMapper;

    public List<ChiTietDatHangDTO> getEmployees(){
        List<ChiTietDatHangBO> bos = chiTietDatHangRepository.findAll();
        return chiTietDatHangMapper.toDto(bos);

    }
}
