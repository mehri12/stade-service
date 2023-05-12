package com.example.stadeservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdStade;
    private String name;
    private String localisation;
    private String time;
    private String participant;
    private long price;
    @OneToOne(mappedBy = "stade")
    private Reservation reservation;

}
