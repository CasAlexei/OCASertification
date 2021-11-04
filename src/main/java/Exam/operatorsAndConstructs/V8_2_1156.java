package Exam.operatorsAndConstructs;

public class V8_2_1156 {
    static boolean a = false;
    static boolean b = false;
    static boolean c = false;

    public static void main(String[] args) {
        boolean bol = (a = true) || (b = true) && (c = true);
        System.out.println("" + a + ", " + b + ", " + c);
    }
}
