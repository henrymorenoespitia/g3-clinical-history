package com.yourClinicalHistory.yourClinicalHistory.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class History {
    @Id
    private String userId;
    private String dni;
    private String diagnostic;
    private String treatment;
    private String nameDoctor;
    private Date time;

    public History(String userId, String dni, String diagnostic, String treatment, String nameDoctor, Date time) {
        this.userId = userId;
        this.dni = dni;
        this.diagnostic = diagnostic;
        this.treatment = treatment;
        this.nameDoctor = nameDoctor;
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) { diagnostic = diagnostic;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
