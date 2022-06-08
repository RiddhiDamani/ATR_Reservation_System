package atrteam.atrreservationsystem.classes;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ROOM_TYPES")
public class RoomTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ROOM_TYPE_STR")
    private String type;

}
