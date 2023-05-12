package com.example.stadeservice.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoordonneBanquaire {
    private String numCarte;
    private int cvv;
    private LocalDate dateExpiration;
}
