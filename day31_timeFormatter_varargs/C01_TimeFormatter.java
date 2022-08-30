package day31_timeFormatter_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : "+tarihSaat);
        //2022-07-25T21:44:04.502119500

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");

        System.out.println(dtf1.format(tarihSaat));// 25/7/22 09:45 PM

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yYYy HH:mm a");

        System.out.println(dtf2.format(tarihSaat));//  25/Jul/2022222022 21:48 PM



    }
}
