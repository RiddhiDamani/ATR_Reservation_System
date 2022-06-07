package atrteam.atrreservationsystem.classes;


import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "LOCATIONS")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "address_str")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state_cd")
    private String state;

    @Column(name = "POSTAL_CODE")
    private String postal_code;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "locations")
    private Hotels hotels;
    
}
