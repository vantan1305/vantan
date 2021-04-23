package com.itsol.iternphamvantan.demo.Service;

import com.itsol.iternphamvantan.demo.dto.MatHangDTO;
import com.itsol.iternphamvantan.demo.entity.MatHangBO;
import com.itsol.iternphamvantan.demo.mapper.MatHangMapper;
import com.itsol.iternphamvantan.demo.repository.MatHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatHangService {
    @Autowired
    private MatHangRepository matHangRepository;
    @Autowired
    private MatHangMapper matHangMapper;

    public List<MatHangDTO> getEmployees(){
        List<MatHangBO> bos = matHangRepository.findAll();
        return matHangMapper.toDto(bos);

    }
}
