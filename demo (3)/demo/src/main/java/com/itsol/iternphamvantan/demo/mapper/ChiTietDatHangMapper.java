package com.itsol.iternphamvantan.demo.mapper;

import com.itsol.iternphamvantan.demo.dto.ChiTietDatHangDTO;
import com.itsol.iternphamvantan.demo.entity.ChiTietDatHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChiTietDatHangMapper extends EntityMapper<ChiTietDatHangDTO, ChiTietDatHangBO> {
}
