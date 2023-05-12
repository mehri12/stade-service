package com.example.stadeservice.Controller;

import com.example.stadeservice.Entities.Stade;
import com.example.stadeservice.Service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stade")
@CrossOrigin(origins = "*")
public class StadeController {
    @Autowired
    StadeService stadeservice;
    @PostMapping("/ajout")
    public String ajoutstade(@RequestBody Stade stade){
        stadeservice.savestade(stade);
        return "stade ajoutèè avec succès";
    }
    @GetMapping("/local/{localisation}")
   public List<Stade> chercherstade(@PathVariable String localisation){
       return  stadeservice.findstade(localisation);
    }
   @DeleteMapping("/delete/{name}")
   List<Stade> deletebyname(@PathVariable String name){
        return stadeservice.deletebynom(name);
   }



}
