package com.fgeorgiou.parcellocker.dto;

import com.fgeorgiou.parcellocker.enums.SlotSize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Data Transfer Object for Slot.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SlotDTO implements Serializable {
    private String slotNumber;
    private boolean available;
    private SlotSize size;
    private LockerDTO locker;
}
