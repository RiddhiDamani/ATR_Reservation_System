package atrteam.atrreservationsystem;

import java.time.LocalDate;

public class Payment {

    private long id;
    private Integer userId;
    private String card_type;
    private String card_holder_name;
    private String card_number;
    private String cvv;
    private LocalDate expDt;

    public Long makePayment(int userId, String card_type, String card_holder_name, String card_number, String cvv, LocalDate expDt) {}
}
