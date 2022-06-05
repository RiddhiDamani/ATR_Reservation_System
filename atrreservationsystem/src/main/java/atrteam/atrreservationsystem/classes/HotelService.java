package atrteam.atrreservationsystem.classes;

import java.util.List;

public interface HotelService {
    
    List<Hotels> getAllHotels();
    List<Hotels> getHotelsBySearchTerm(String searchTerm);
}
