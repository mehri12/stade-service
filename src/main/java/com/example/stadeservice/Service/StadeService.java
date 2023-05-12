package com.example.stadeservice.Service;

import com.example.stadeservice.Entities.Reservation;
import com.example.stadeservice.Entities.ReservationPayementDTO;
import com.example.stadeservice.Entities.Stade;
import com.example.stadeservice.Entities.payement;
import com.example.stadeservice.Repositories.ReservationRepo;
import com.example.stadeservice.Repositories.StadeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StadeService {
    @Autowired
    StadeRepo stadeRepo;

    @Autowired
    ReservationRepo reservationRepo;

    public void savestade(Stade stade) {
        stadeRepo.save(stade);
    }


    public List<Stade> findstade(String localisation) {
       return stadeRepo.findByLocalisation(localisation);
    }
    public List<Stade> deletebynom(String name){
        stadeRepo.deleteByName(name);
        return stadeRepo.findAll();
    }
    @Autowired
    private RestTemplate template;

    public Reservation placestade(ReservationPayementDTO reservation){

        Reservation reservation1 = new Reservation();

        payement paymentReq = new payement();
        paymentReq.setReservationId(reservation.getIdreservation());
        paymentReq.setCoordonneBanquaire(reservation.getCoordonneBanquaire());
        payement paymentRes =
                template.postForObject("http://localhost:8083/payment/doPay/",
                        paymentReq, payement.class);

        if(paymentRes.getPayementstatus().equals("success")){
            reservation1 = reservationRepo.save(reservation.getReservation());
        }
        return reservation1;
    }
}
