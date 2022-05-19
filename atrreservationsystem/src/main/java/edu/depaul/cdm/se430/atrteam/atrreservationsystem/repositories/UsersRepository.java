package edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>  {

    public Users getUserByUsername(@Param("username") String username);

}