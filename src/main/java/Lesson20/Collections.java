package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);

        String[] st1 = new String[8];
        st1 = list.toArray(new String[0]);
        for(String s: st1)
            System.out.println(s);


    }
}
