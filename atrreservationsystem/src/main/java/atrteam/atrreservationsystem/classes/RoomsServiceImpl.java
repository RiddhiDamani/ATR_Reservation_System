package atrteam.atrreservationsystem.classes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import atrteam.atrreservationsystem.repositories.RoomsRepository;

@Service
public class RoomsServiceImpl implements RoomsService{

    @Autowired
    private RoomsRepository roomsRepository;

    @Override
    public List<Rooms> getAllRooms(Integer hotelId) {
        return roomsRepository.findByHotelId(hotelId);
    }
    
}
