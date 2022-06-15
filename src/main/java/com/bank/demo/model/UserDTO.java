package com.bank.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class UserDTO {
    @NotNull(message = "Cannot be null")
    @Size(min = 3, max = 10)

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private Date dateOfBirth;
    private Date createdAt;
    private String password;
    private String role;
}
