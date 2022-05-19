package edu.depaul.cdm.se430.atrteam.atrreservationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Users;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.UsersRepository;

@Service
public class UserService {
    
    @Autowired
    private UsersRepository usersRepository;

    public void saveUserWithDefaultRole(Users user) {
    }
}
