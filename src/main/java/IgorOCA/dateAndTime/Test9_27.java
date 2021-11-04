package IgorOCA.dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test9_27 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2016-07-13")
                .plusDays(31)
                .format(DateTimeFormatter.ISO_DATE);       // ok
//                .format(DateTimeFormatter.ISO_DATE_TIME);   // exception on RunTime
        System.out.println(date);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(new Integer(2));
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.remove("2");
        System.out.println(list1);
    }
}
