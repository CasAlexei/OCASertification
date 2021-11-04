package Exam.dataType;

import java.util.ArrayList;

public class V8_2_925 {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> al = new ArrayList<>();

        al.add(111D);
        System.out.println(al.indexOf(1.0));
        System.out.println(al.contains("string"));
//        Double d = al.get(al.length);
    }
}
