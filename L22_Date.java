//Learning 22 : Date in Java
/*
     Java allows us to get the information of the date and time by using the java.time package.
     This package consists of many data and time classes so that we are able to obtain the
     information of date and time in Java.

     Types of date classes :
        1) LocalDate     : Represents a date (year, month, day (yyyy-MM-dd))
        2) LocalTime     : Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
        3) LocalDateTime : Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
Date    4) TimeFormatter : Formatter for displaying and parsing date-time objects
*/

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class L22_Date {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        // feel free to try out more examples by using the data classes provided in the Java
    }
}

