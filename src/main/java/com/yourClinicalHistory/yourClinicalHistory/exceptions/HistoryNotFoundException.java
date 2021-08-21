package com.yourClinicalHistory.yourClinicalHistory.exceptions;

public class HistoryNotFoundException extends RuntimeException{
    public HistoryNotFoundException(String message) {
        super(message);
    }
}
