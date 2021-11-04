package Exam.javaAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class V8_2_1433 {
    public static void main(String[] args) {                                   //1
        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");            //2
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME); //3
        System.out.println(greatDayStr);                                       //4
    }
}
