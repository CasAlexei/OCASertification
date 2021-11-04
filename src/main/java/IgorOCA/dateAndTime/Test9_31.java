package IgorOCA.dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test9_31 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(1995, 05, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, YYYY");
        System.out.println(ld.format(formatter));
    }
}
