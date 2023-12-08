package java8.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {



        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        String dateStr = "2023-11-10";
        LocalDate parsedDate = LocalDate.parse(dateStr);
        System.out.println("Parsed Date: " + parsedDate);
//
        String dateTimeStr = "2023-11-10T12:30:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr);
        System.out.println("Parsed Date and Time: " + parsedDateTime);

        LocalDate futureDate = currentDate.plusDays(7);
        System.out.println("Date 7 days from now: " + futureDate);

        LocalDate earlierDate = LocalDate.of(2023, 11, 1);
        boolean isBefore = earlierDate.isBefore(currentDate);
        System.out.println("Is the earlier date before the current date? " + isBefore);
    }
}
