package com.itsol.iternphamvantan.demo.mapper;

import com.itsol.iternphamvantan.demo.dto.LoaiHangDTO;
import com.itsol.iternphamvantan.demo.entity.LoaiHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoaiHangMapper extends EntityMapper<LoaiHangDTO, LoaiHangBO> {
}
