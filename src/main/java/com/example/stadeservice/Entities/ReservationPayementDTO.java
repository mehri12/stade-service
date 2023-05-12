package com.example.stadeservice.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Data
public class ReservationPayementDTO {
    private int idreservation;
    private Date date;
    private Stade stade;
    private Client client;
    private CoordonneBanquaire coordonneBanquaire;


    public Reservation getReservation(){
        return new Reservation(this.getIdreservation(),this.date,this.stade,this.client);
    }
}
