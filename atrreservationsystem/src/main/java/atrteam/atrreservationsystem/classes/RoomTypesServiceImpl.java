package atrteam.atrreservationsystem.classes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import atrteam.atrreservationsystem.repositories.RoomTypesRepository;

@Service
public class RoomTypesServiceImpl implements RoomTypesService {

    @Autowired
    private RoomTypesRepository roomTypesRepository;
    
    @Override
    public List<RoomTypes> getAllRoomTypes() {
        return roomTypesRepository.findAll();
    }
    
}
