package com.yourClinicalHistory.yourClinicalHistory.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Info {
    @Id
    private String userId;
    private String Dni;
    private String TypeDni;
    private String TimeBorn;
    private String age;
    private String occupation;
    private Date lastChange;


    public Info(String userId, String dni, String typeDni, String timeBorn, String age, String occupation, Date lastChange) {
        this.userId = userId;
        Dni = dni;
        TypeDni = typeDni;
        TimeBorn = timeBorn;
        this.age = age;
        this.occupation = occupation;
        this.lastChange = lastChange;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getTypeDni() {
        return TypeDni;
    }

    public void setTypeDni(String typeDni) {
        TypeDni = typeDni;
    }

    public String getTimeBorn() {
        return TimeBorn;
    }

    public void setTimeBorn(String timeBorn) {
        TimeBorn = timeBorn;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }
}
