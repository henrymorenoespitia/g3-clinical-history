package com.yourClinicalHistory.yourClinicalHistory.repositories;


import com.yourClinicalHistory.yourClinicalHistory.models.History;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HistoryRepositories extends MongoRepository<History, String> {
    History findByUserId(String userId);
    List<History> findByDni(String dni);
    //History findByDni(String dni);
    List<History> findByNameDoctor(String NameDoctor);
}
