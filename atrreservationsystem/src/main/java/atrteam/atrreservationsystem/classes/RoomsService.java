package atrteam.atrreservationsystem.classes;

import java.util.List;

public interface RoomsService {
    List<Rooms> getAllRooms(Integer hotelId);
}
