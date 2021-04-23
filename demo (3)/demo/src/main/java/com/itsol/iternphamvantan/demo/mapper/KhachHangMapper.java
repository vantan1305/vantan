package com.itsol.iternphamvantan.demo.mapper;

import com.itsol.iternphamvantan.demo.dto.KhachHangDTO;
import com.itsol.iternphamvantan.demo.entity.KhachHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KhachHangMapper extends EntityMapper<KhachHangDTO, KhachHangBO> {
}
