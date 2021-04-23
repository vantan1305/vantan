package com.itsol.iternphamvantan.demo.mapper;

import com.itsol.iternphamvantan.demo.dto.NhanVienCuaHangDTO;
import com.itsol.iternphamvantan.demo.entity.NhanVienCuaHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NhanVienCuaHangMapper extends EntityMapper<NhanVienCuaHangDTO, NhanVienCuaHangBO> {

}
