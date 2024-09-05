package com.fgeorgiou.parcellocker.model;

import com.fgeorgiou.parcellocker.enums.SlotSize;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Parcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parcelId;

    @Column
    private String parcelNumber;

    @Enumerated(EnumType.STRING)
    private SlotSize size;

    @Column(nullable = false)
    private String pin;

    @Column(nullable = false)
    private boolean collected = false;

    @Column(nullable = false)
    private boolean expired = false;

    @Column(nullable = false)
    private LocalDateTime addedToLocker;

    @Column
    private LocalDateTime collectedAt;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
