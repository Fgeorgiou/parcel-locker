package com.fgeorgiou.parcellocker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object for User.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private boolean accountExpired;
    private boolean credentialsExpired;
    private boolean accountLocked;
}
