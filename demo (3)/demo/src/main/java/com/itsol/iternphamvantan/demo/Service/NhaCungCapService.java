package com.itsol.iternphamvantan.demo.Service;

import com.itsol.iternphamvantan.demo.dao.NhaCungCapDAO;
import com.itsol.iternphamvantan.demo.dto.NhaCungCapDTO;
import com.itsol.iternphamvantan.demo.dto.NhanVienCuaHangDTO;
import com.itsol.iternphamvantan.demo.entity.NhaCungCapBO;
import com.itsol.iternphamvantan.demo.mapper.NhaCungCapMapper;
import com.itsol.iternphamvantan.demo.repository.NhaCungCapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaCungCapService {
    @Autowired
    private NhaCungCapRepository nhaCungCapRepository;
    @Autowired
    private NhaCungCapMapper nhaCungCapMapper;
    @Autowired
    private NhaCungCapDAO nhaCungCapDAO;


    public List<NhaCungCapDTO> getEmployees(){
        List<NhaCungCapBO> bos = nhaCungCapRepository.findAll();
        return nhaCungCapMapper.toDto(bos);
    }
}
