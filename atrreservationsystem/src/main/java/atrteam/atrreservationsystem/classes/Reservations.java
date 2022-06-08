package atrteam.atrreservationsystem.classes;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name = "RESERVATIONS")
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "START_DT")
    private LocalDate startDate;

    @Column(name = "END_DT")
    private LocalDate endDate;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "ROOM_ID")
    private Integer roomId;
}
