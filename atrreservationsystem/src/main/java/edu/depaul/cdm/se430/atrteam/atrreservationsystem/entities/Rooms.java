package edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities;

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
    private int roomTypeID;

    @NotNull
    @Column(name = "GUESTS")
    private int guests;

    @Column(name = "room_name")
    private String roomName;

    @NotNull
    @Column(name = "HOTEL_ID")
    private int hotelId;

    @Column(name = "COST_PER_NIGHT")
    private double costPerNight;
}
