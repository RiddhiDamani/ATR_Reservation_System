package edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Locations;


public interface LocationsRepository extends JpaRepository<Locations, Integer>  {

    List<Locations> findLocationsByMultiParams(@Param("searchTerm") String searchTerm);
}