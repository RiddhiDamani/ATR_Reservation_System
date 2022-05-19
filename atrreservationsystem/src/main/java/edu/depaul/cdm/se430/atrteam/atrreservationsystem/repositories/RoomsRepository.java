package edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Rooms;

public interface RoomsRepository extends JpaRepository<Rooms, Integer>  {
    public List<Rooms> findByHotelId(Integer hotelId);
}
