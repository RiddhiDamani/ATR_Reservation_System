package atrteam.atrreservationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import atrteam.atrreservationsystem.classes.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>  {
}