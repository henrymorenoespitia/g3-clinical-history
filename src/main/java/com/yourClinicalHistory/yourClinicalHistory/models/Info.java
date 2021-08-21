package com.yourClinicalHistory.yourClinicalHistory.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
public class Info {
    @Id
    private String userId;
    private String dni;
    private String typeDni;
    private String timeBorn;
    private String age;
    private String occupation;
    private Date lastChange;


    public Info(String userId, String dni, String typeDni, String timeBorn, String age, String occupation, Date lastChange) {
        this.userId = userId;
        this.dni = dni;
        this.typeDni = typeDni;
        this.timeBorn = timeBorn;
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
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTypeDni() {
        return typeDni;
    }

    public void setTypeDni(String typeDni) {
        this.typeDni = typeDni;
    }

    public String getTimeBorn() {
        return timeBorn;
    }

    public void setTimeBorn(String timeBorn) {
        this.timeBorn = timeBorn;
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
