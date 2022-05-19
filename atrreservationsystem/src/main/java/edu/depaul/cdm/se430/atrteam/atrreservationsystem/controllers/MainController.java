package edu.depaul.cdm.se430.atrteam.atrreservationsystem.controllers;

import java.time.LocalDate;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.HotelsRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.LocationsRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.PaymentRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.ReservationsRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.RoomTypesRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.RoomsRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.repositories.UsersRepository;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.service.RoomTypesService;
import edu.depaul.cdm.se430.atrteam.atrreservationsystem.service.RoomsService;

@Controller
public class MainController {

	@Autowired
    private RoomsService roomsService;

	@Autowired
    private RoomTypesService roomTypesService;

	@Autowired
	private HotelsRepository hotelsRepository;

	@Autowired
	private LocationsRepository locationsRepository;

	@Autowired
	private ReservationsRepository reservationsRepository;

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private RoomsRepository roomsRepository;

	@Autowired
	private RoomTypesRepository roomTypesRepository;

	@Autowired
	private PaymentRepository paymentRepository;

	public String hotelDetails(Model model
							  ,@RequestParam(name = "hotelid") Integer hotelId){

		return "";
	}

	public String bookRoom(Model model
						  ,@RequestParam(name = "roomid") Integer roomId
						  ){
		
		return "";	
	}

	public String confirmation(Model model
	,@RequestParam(name = "resid") Integer reservationId
	,@RequestParam(name = "cardtype") String cardType
	,@RequestParam(name = "cardholdername") String cardHolderName
	,@RequestParam(name = "cardnumber") String cardNumber
	,@RequestParam(name = "cardcvv") String cardCVV
	,@RequestParam(name = "cardexpdt") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate cardExpDate){
	
		return "";
	}

	public String cancellation(Model model
	,@RequestParam(name = "resid") Long reservationId){
	
		return "";
	}

	public String manage(Model model
	,@RequestParam(name = "bookingID", required = false) Optional<Long> bookingId){

	  return "";
	}

	public String update(Model model
	,@RequestParam(name = "resid") Long bookingId
	,@RequestParam(name = "checkindate") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate checkInDate
	,@RequestParam(name = "checkoutdate") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate checkOutDate){
	return "";
	
	}


	public String payment(Model model
	,@RequestParam(name = "roomid") Integer roomId
	,@RequestParam(name = "startdt") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate checkInDate
	,@RequestParam(name = "enddt") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate checkOutDate){
	
		return "";
	}
}