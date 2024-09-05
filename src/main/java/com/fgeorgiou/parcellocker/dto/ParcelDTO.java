package com.fgeorgiou.parcellocker.dto;

import com.fgeorgiou.parcellocker.enums.SlotSize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Data Transfer Object for Parcel.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParcelDTO implements Serializable {
    private String parcelNumber;
    private SlotSize size;
    private String pin;
    private boolean collected;
    private boolean expired;
    private LocalDateTime addedToLocker;
    private LocalDateTime collectedAt;
}
