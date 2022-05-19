package edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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
    @NotNull
    private LocalDate startDate;

    @Column(name = "END_DT")
    @NotNull
    private LocalDate endDate;

    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "ROOM_ID")
    private int roomId;
}
