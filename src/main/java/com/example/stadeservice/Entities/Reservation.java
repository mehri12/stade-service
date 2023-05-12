package com.example.stadeservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idreservation;
    private Date date;
    @OneToOne(cascade = CascadeType.ALL)
    private Stade stade;
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;
}
