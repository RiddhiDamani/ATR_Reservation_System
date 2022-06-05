package atrteam.atrreservationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import atrteam.atrreservationsystem.classes.RoomTypes;

public interface RoomTypesRepository extends JpaRepository<RoomTypes, Integer>  {
}

