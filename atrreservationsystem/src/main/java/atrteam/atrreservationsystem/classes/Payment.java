package atrteam.atrreservationsystem.classes;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @NotNull
    @Column(name = "USER_ID")
    private Integer user_id;

    @NotNull
    @Column(name = "CARD_TYPE")
    private String card_type;

    @NotNull
    @Column(name = "CARD_HOLDER_NAME")
    private String card_holder_name;

    @NotNull
    @Column(name = "CARD_NUMBER")
    private String card_number;

    @NotNull
    @Column(name = "CVV")
    private String cvv;

    @NotNull
    @Column(name = "exp_dt")
    private LocalDate expDt;


}
