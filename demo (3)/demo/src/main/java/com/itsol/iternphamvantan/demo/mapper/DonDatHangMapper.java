package com.itsol.iternphamvantan.demo.mapper;

import com.itsol.iternphamvantan.demo.dto.DonDatHangDTO;
import com.itsol.iternphamvantan.demo.entity.DonDatHangBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DonDatHangMapper extends EntityMapper<DonDatHangDTO, DonDatHangBO> {
}
