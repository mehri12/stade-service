package com.example.stadeservice.Controller;

import com.example.stadeservice.Entities.Reservation;
import com.example.stadeservice.Entities.ReservationPayementDTO;
import com.example.stadeservice.Service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    StadeService stadeService;
    @PostMapping("/placestade/")
    public Reservation placestade(@RequestBody ReservationPayementDTO reservation){
        return stadeService.placestade(reservation);
    }
}
