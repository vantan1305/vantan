package com.itsol.iternphamvantan.demo.mapper;

import com.itsol.iternphamvantan.demo.dto.NhaCungCapDTO;
import com.itsol.iternphamvantan.demo.entity.NhaCungCapBO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NhaCungCapMapper extends EntityMapper<NhaCungCapDTO, NhaCungCapBO> {
}
