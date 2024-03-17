package br.com.iyisakuma.bookingme.domain.entity;

import br.com.iyisakuma.bookingme.domain.enumeration.RoomStatus;
import br.com.iyisakuma.bookingme.domain.enumeration.RoomType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private RoomType type;
    private Integer capacity;
    @Enumerated(EnumType.ORDINAL)
    private RoomStatus status;

}
