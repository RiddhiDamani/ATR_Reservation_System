package atrteam.atrreservationsystem.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import atrteam.atrreservationsystem.repositories.LocationsRepository;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationsRepository locationsRepository;
    
    @Override
    public List<Locations> getAllLocations() {
        return locationsRepository.findAll();
    }
    
}
