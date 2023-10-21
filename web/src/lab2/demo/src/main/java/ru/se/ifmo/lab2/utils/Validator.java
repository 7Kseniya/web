package ru.se.ifmo.lab2.utils;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validator {
    DecimalFormat decimalFormat = new DecimalFormat("#.#####");

    public Float parseFloat(String value) {
        if (value == null) return null;
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public LocalDateTime parseDate(String value) {
        if (value == null) return null;
        try {
            return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss"));
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}
