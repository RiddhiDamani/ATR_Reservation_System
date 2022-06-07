package atrteam.atrreservationsystem.classes;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "HOTELS")
public class Hotels {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @NotBlank(message = "hotel name may not be empty")
    @Column(name = "HOTEL_NAME")
    private String hotel_name;

    @Column(name = "LOCATION_ID")
    private Integer locationId;

    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Locations locations;
    
}
