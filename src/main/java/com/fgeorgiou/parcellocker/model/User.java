package com.fgeorgiou.parcellocker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private boolean enabled = true;

    // Inverse properties
    @Column(nullable = false)
    private boolean accountExpired = false;

    @Column(nullable = false)
    private boolean credentialsExpired = false;

    @Column(nullable = false)
    private boolean accountLocked = false;

    @Column(nullable = false, updatable = false)
    private LocalDateTime accountCreated = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime lastUpdated = LocalDateTime.now();

    @PreUpdate
    protected void onUpdate() {
        lastUpdated = LocalDateTime.now();
    }
}