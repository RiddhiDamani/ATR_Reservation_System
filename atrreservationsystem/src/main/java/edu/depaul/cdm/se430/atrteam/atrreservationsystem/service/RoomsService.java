package edu.depaul.cdm.se430.atrteam.atrreservationsystem.service;

import java.util.List;

import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Rooms;

public interface RoomsService {
    List<Rooms> getAllRooms(Integer hotelId);
}
