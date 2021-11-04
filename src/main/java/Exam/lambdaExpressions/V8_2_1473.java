package Exam.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class V8_2_1473 {
    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), (List al) -> al.isEmpty());
        System.out.println(b);
    }
    }
