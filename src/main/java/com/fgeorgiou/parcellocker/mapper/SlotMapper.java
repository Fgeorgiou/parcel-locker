package com.fgeorgiou.parcellocker.mapper;

import com.fgeorgiou.parcellocker.dto.SlotDTO;
import com.fgeorgiou.parcellocker.model.Slot;
import lombok.Generated;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@Generated
public interface SlotMapper {
    SlotMapper INSTANCE = Mappers.getMapper(SlotMapper.class);

    SlotDTO toDTO(Slot slot);

    Slot toEntity(SlotDTO slotDTO);
}
