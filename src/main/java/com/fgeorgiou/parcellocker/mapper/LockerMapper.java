package com.fgeorgiou.parcellocker.mapper;

import com.fgeorgiou.parcellocker.dto.LockerDTO;
import com.fgeorgiou.parcellocker.model.Locker;
import lombok.Generated;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@Generated
public interface LockerMapper {
    LockerMapper INSTANCE = Mappers.getMapper(LockerMapper.class);

    LockerDTO toDTO(Locker locker);

    Locker toEntity(LockerDTO lockerDTO);
}
