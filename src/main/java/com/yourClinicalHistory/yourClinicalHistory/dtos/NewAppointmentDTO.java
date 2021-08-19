package com.yourClinicalHistory.yourClinicalHistory.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewAppointmentDTO {

    private PersonalData personalData ;
    private AppointmentData appointmentData;

}
