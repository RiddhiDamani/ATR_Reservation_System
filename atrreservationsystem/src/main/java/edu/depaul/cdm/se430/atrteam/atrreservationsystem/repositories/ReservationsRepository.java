package edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Reservations;


public interface ReservationsRepository extends JpaRepository<Reservations, Long>  {
    List<Reservations> findOverlappingRecord(@Param("startDate") LocalDate startDate
                                        ,@Param("endDate") LocalDate endDate
                                        ,@Param("roomId") Integer roomId);
}