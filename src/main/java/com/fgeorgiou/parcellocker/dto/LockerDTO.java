package com.fgeorgiou.parcellocker.dto;

import com.fgeorgiou.parcellocker.enums.LockerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Data Transfer Object for Locker.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LockerDTO implements Serializable {
    private String lockerNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;
    private double latitude;
    private double longitude;
    private LockerStatus status;
    private List<SlotDTO> slots;
}
