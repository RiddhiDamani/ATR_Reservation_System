package atrteam.atrreservationsystem.classes;


import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name= "ROOMS")
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ROOM_TYPE_ID")
    private Integer roomTypeID;

    @NotNull
    @Column(name = "GUESTS")
    private Integer guests;

    @Column(name = "room_name")
    private String roomName;

    @NotNull
    @Column(name = "HOTEL_ID")
    private Integer hotelId;

    @Column(name = "COST_PER_NIGHT")
    private double costPerNight;

}
