package edu.depaul.cdm.se430.atrteam.atrreservationsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Hotels;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Locations;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.HotelsRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.LocationsRepository;

@Component
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelsRepository hotelsRepository;

    @Autowired
    private LocationsRepository locationsRepository;

    @Override
    public List<Hotels> getAllHotels() {
        return hotelsRepository.findAll();
    }

    public List<Hotels> getHotelsBySearchTerm(String searchTerm) {
        List<Integer> locIds = new ArrayList<Integer>();
        List<Locations> locs = locationsRepository.findLocationsByMultiParams(searchTerm);
        for (Locations locations : locs) {
            locIds.add(locations.getId());
        }
        return hotelsRepository.findHotelsByLocIds(locIds);
    }
    
}
