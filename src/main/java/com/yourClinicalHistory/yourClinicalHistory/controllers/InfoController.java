package com.yourClinicalHistory.yourClinicalHistory.controllers;


import com.yourClinicalHistory.yourClinicalHistory.exceptions.HistoryNotFoundException;
import com.yourClinicalHistory.yourClinicalHistory.exceptions.InfoNotFoundException;
import com.yourClinicalHistory.yourClinicalHistory.exceptions.UserAlreadyExistException;
import com.yourClinicalHistory.yourClinicalHistory.models.Info;
import com.yourClinicalHistory.yourClinicalHistory.repositories.InfoRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class InfoController {
    private final InfoRepositories infoRepositories;

    public InfoController(InfoRepositories infoRepositories){
        this.infoRepositories = infoRepositories;
        Info newInfo = new Info( "001", "123456789", "cc", "2000-01-01", "25", "Trabajador", new Date() );
        this.infoRepositories.save(newInfo);
    }

    @GetMapping("/api/v1/patient/info/{dni}")
    public List<Info>  getInfoRepositories(@PathVariable String dni) {
        var userInfo = infoRepositories.findByDni(dni) ;
        System.out.println("DAtos de l user");
        System.out.println(userInfo);
        if (userInfo == null)
            throw new InfoNotFoundException("No se encontro informacion con el userId: " + dni);

        return userInfo;
    }

    /**
     * Aurthorization info: before in API Gateway, receive dni after authentication
     * @param info
     * @return
     */
  @PostMapping("/api/v1/patient/info")
    public Info createNewPatient(@RequestBody Info info  ){
        var saveRespons = this.infoRepositories.findByDni( info.getDni() );
        if ( ! saveRespons.isEmpty() )
            throw  new UserAlreadyExistException(" User already exist, no repeat.");
        return this.infoRepositories.save(info);
    }


    @PutMapping("/api/v1/patient/info")
    public Info updatePatient(@RequestBody Info info ){

      var saveResponse = this.infoRepositories.findByDni(info.getDni() ) ;
        if (  saveResponse.isEmpty() )
            return this.infoRepositories.save(info);

        throw  new InfoNotFoundException(" User not found. Check information");
    }




}
