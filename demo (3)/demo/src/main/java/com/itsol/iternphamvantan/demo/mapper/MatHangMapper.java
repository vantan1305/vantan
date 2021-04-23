package com.itsol.iternphamvantan.demo.mapper;

import com.itsol.iternphamvantan.demo.dto.MatHangDTO;
import com.itsol.iternphamvantan.demo.entity.MatHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MatHangMapper extends EntityMapper<MatHangDTO, MatHangBO> {
}
