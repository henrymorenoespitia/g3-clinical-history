package com.yourClinicalHistory.yourClinicalHistory.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicalHistory {

    @Id
    private String id;
    private Date appointmentData;

}
