package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Clock myClock = Clock.systemUTC();
        Instant start = myClock.instant();
        Instant end = myClock.instant();
        Duration elapsed = Duration.between(start,end);
        //Time of instant start and instant end time between
        System.out.println("Time between two instants__________");
        System.out.println(elapsed);

        //calculating between two dates
        System.out.println("Calculation between two dates__________");
        LocalDate dateTime = LocalDate.of(1900,Month.JULY,1);
        LocalDate dt2 = LocalDate.of(1993,1,29);
        Period between = Period.between(dateTime, dt2);
        System.out.println(between);

        //Getting EU formated date and time
        System.out.println("Time now EU __________");
        LocalDateTime localDateTime = LocalDateTime.now();
        String pattern = "dd-MM-yyyy HH:mm:ss";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
