package com.fgeorgiou.parcellocker.model;

import com.fgeorgiou.parcellocker.enums.LockerStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Locker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lockerId;

    @Column(nullable = false, unique = true)
    private String lockerNumber;

    @Column(nullable = false)
    private String streetAddress;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String postalCode;

    @Column
    private double latitude;

    @Column
    private double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LockerStatus status;

    @OneToMany(mappedBy = "locker", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Slot> slots;
}
