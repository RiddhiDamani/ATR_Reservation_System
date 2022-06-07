package atrteam.atrreservationsystem.classes;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import atrteam.atrreservationsystem.repositories.HotelsRepository;
import atrteam.atrreservationsystem.repositories.LocationsRepository;

@Component
public class HotelServiceImpl implements HotelService {

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
