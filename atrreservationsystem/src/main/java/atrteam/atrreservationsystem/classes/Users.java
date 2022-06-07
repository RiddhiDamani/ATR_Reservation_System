package atrteam.atrreservationsystem.classes;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table( name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;

    @Column(name = "username", unique = true, nullable = false)
    @NotBlank(message = "Username field cannot be empty!")
    private String username;

    @Column(name = "password_hash")
    @NotBlank(message = "Password field cannot be empty")
    private String passwordHash;

    @Column(name = "first_name")
    @NotBlank(message = "First name field cannot be empty")
    private String fname;

    @Column(name = "last_name")
    @NotBlank(message = "Last name field cannot be empty")
    private String lname;

    @Column(name = "email")
    @NotBlank(message = "Email field cannot be empty")
    private String email;

    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "users_roles",
        joinColumns = @JoinColumn(name = "USER_ID"),
        inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles = new HashSet<>();

    public void addRole(Role role) {
        this.roles.add(role);
    }

};
