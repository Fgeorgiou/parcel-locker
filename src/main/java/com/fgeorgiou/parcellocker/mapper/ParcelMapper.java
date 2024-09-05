package com.fgeorgiou.parcellocker.mapper;

import com.fgeorgiou.parcellocker.dto.ParcelDTO;
import com.fgeorgiou.parcellocker.model.Parcel;
import lombok.Generated;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@Generated
public interface ParcelMapper {
    ParcelMapper INSTANCE = Mappers.getMapper(ParcelMapper.class);

    ParcelDTO toDTO(Parcel pkg);

    Parcel toEntity(ParcelDTO parcelDTO);
}
