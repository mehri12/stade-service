package com.example.stadeservice.Repositories;

import com.example.stadeservice.Entities.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StadeRepo extends JpaRepository<Stade, Integer> {
    List<Stade> findByLocalisation(String localisation);

    List<Stade> deleteByName(String name);
}
