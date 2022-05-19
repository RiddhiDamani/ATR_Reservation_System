package edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table( name = "users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;

    @Column(name = "username", unique = true, nullable = false)
    @NotBlank(message = "Username field cannot be empty!")
    @Size(min = 3, max = 10, message = "Username must be between 3 and 10 characters") 
    @NotNull(message = "Username cannot be null")
    private String username;

    @Column(name = "password_hash")
    @NotBlank(message = "Password field cannot be empty")
    @NotNull(message = "Password cannot be null")
    private String passwordHash;

    @Column(name = "first_name")
    @NotBlank(message = "First name field cannot be empty")
    @Size(min = 2, max = 20, message = "First Name must be between 2 and 20 characters long") 
    @NotNull(message = "First Name cannot be null")
    private String fname;

    @Column(name = "middle_name")
    private String mname;

    @Column(name = "last_name")
    @NotBlank(message = "Last name field cannot be empty")
    @Size(min = 2, max = 20, message = "Last Name must be between 2 and 20 characters long") 
    @NotNull(message = "Last Name cannot be null")
    private String lname;

    @Email(message = "Email should be valid")
    @Column(name = "email")
    @NotBlank(message = "Email field cannot be empty")
    @NotNull(message = "Email cannot be null")
    private String email;

    private boolean enabled;


}
