package atrteam.atrreservationsystem.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import atrteam.atrreservationsystem.classes.Rooms;

public interface RoomsRepository extends JpaRepository<Rooms, Integer>  {
    public List<Rooms> findByHotelId(Integer hotelId);
}
