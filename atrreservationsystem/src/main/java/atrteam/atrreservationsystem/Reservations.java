package atrteam.atrreservationsystem;

import java.time.LocalDate;

public class Reservations {
    private long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer userId;
    private Integer roomId;

    public String bookRoom(Integer roomId, Integer userId) {};
    public String cancellation(Integer id) {};
    public String update(Integer id, LocalDate startDate, LocalDate endDate) {};
}
