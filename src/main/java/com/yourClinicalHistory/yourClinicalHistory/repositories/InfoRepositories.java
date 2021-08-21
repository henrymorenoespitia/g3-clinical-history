package com.yourClinicalHistory.yourClinicalHistory.repositories;



import com.yourClinicalHistory.yourClinicalHistory.models.Info;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InfoRepositories extends MongoRepository<Info,String> {
    List<Info> findByDni(String Dni);

}
