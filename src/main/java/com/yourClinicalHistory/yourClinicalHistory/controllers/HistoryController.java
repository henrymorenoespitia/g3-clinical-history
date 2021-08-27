package com.yourClinicalHistory.yourClinicalHistory.controllers;

import com.yourClinicalHistory.yourClinicalHistory.exceptions.HistoryNotFoundException;
import com.yourClinicalHistory.yourClinicalHistory.models.History;
import com.yourClinicalHistory.yourClinicalHistory.repositories.HistoryRepositories;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class HistoryController {
    private final HistoryRepositories historyRepositories;

    public HistoryController(HistoryRepositories historyRepositories) {
        this.historyRepositories = historyRepositories;
        History newHistory1 = new History("001", "123456789", "El paciente declara un dolor de espalda",
                "ibuprofenno y descanso de dos dias", "Jose Perez", new Date());
        this.historyRepositories.save(newHistory1);
    }

    @GetMapping("/api/v1/patient/history/{dni}")
    List<History> userHistory(@PathVariable String dni) {
        var userHistory = historyRepositories.findById(dni);// .orElse(null);
        // var theHistory = historyRepositories.findById(dni);
        var responseHistory = historyRepositories.findByDni(dni);
        System.out.println("userHistory" + responseHistory.toString());
        if (userHistory == null)
            throw new HistoryNotFoundException("No se encontro una cuenta con el userId: " + dni);
        // List<History> transactions = Stream.concat(transactionsOrigin.stream(),
        // transactionsDestiny.stream()).collect(Collectors.toList());
        return responseHistory;
    }

    @PostMapping("api/v1/patient/appointment/new")
    public History createNewRegistry(@RequestBody History historyRequest) {
        History saveResponse = null;
        saveResponse = historyRepositories.save(historyRequest);

        return saveResponse;
    }

}
