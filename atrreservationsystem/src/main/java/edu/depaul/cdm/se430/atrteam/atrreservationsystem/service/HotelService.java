package edu.depaul.cdm.se430.atrteam.atrreservationsystem.service;

import java.util.List;


import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Hotels;

public interface HotelService {
    List<Hotels> getAllHotels();
    List<Hotels> getHotelsBySearchTerm(String searchTerm);
}
