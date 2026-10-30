package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDatesApp {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        // Format 1: 04/22/2026
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(format1));

        // Format 2: 2026-04-22
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(format2));

        // Format 3: Wednesday, April 22, 2026
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        System.out.println(today.format(format3));

        // Format 4: GMT time
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        System.out.println(gmt.format(format4));

        // Challenge: Local time
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");
        System.out.println(today.format(format5));
    }
}