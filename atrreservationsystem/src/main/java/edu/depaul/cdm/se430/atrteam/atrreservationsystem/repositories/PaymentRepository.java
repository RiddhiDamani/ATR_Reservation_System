package edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.entities.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Integer>  {
}