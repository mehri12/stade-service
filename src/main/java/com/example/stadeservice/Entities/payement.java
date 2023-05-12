package com.example.stadeservice.Entities;

import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class payement {
    private int payment_id;
    private int reservationId;
    private CoordonneBanquaire coordonneBanquaire;
    private String payementstatus;
}
