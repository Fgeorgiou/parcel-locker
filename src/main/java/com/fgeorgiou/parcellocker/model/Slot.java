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

@Entity
@Data
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slotId;

    @Column(nullable = false)
    private String slotNumber;

    @Column
    private boolean available;

    @Enumerated(EnumType.STRING)
    private SlotSize size;

    @ManyToOne
    @JoinColumn(name = "locker_id")
    private Locker locker;
}
