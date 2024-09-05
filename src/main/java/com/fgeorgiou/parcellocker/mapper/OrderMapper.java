package com.fgeorgiou.parcellocker.mapper;

import com.fgeorgiou.parcellocker.dto.LockerDTO;
import com.fgeorgiou.parcellocker.model.Locker;
import lombok.Generated;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@Generated
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    LockerDTO toDTO(Locker locker);

    Locker toEntity(LockerDTO lockerDTO);
}
