package br.com.iyisakuma.bookingme.domain.entity;

import br.com.iyisakuma.bookingme.domain.enumeration.ReservationStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    @ManyToOne
    private Room room;
    @Enumerated(EnumType.ORDINAL)
    private ReservationStatus status;

}
