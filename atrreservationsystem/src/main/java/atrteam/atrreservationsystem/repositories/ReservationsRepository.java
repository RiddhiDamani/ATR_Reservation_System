package atrteam.atrreservationsystem.repositories;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import atrteam.atrreservationsystem.classes.Reservations;


public interface ReservationsRepository extends JpaRepository<Reservations, Long>  {
    @Query("SELECT r from Reservations r WHERE r.startDate <= :endDate AND r.endDate >= :startDate AND r.roomId = :roomId")
    List<Reservations> findOverlappingRecord(@Param("startDate") LocalDate startDate
                                        ,@Param("endDate") LocalDate endDate
                                        ,@Param("roomId") Integer roomId);
}