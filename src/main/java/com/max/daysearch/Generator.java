package com.max.daysearch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

@RestController
public class Generator {

    @GetMapping("/")
    public Data greeting (@RequestParam(value = "year") int year) {
        return new Data(HttpStatus.OK.value(), getDate(year));
    }

    private String getDate(int year) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String message;
        if (year > 0) {
            Calendar calendar;
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                calendar = new GregorianCalendar(year, Calendar.SEPTEMBER, 12);
            else
                calendar = new GregorianCalendar(year, Calendar.SEPTEMBER, 13);
            message = dateFormat.format(calendar.getTime());
        } else {
            message = "INCORRECT INPUT";
        }
        return message;
    }
}
