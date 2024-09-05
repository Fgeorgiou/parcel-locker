package com.fgeorgiou.parcellocker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Data Transfer Object for Order.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String orderNumber;
    private LockerDTO locker;
    private SlotDTO slot;
    private LocalDateTime expirationTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<ParcelDTO> parcels;
}
