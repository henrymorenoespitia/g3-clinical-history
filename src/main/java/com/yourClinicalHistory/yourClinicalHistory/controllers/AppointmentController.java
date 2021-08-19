package com.yourClinicalHistory.yourClinicalHistory.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
        // create and save
    }


    @PostMapping("/patient/appointment/new/{userId}")


}
