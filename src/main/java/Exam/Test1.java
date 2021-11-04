package Exam;

public class Test1 {
    private double side=0;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.side = 5;
        boolean b = true||false;
        Boolean bB;
        bB = Boolean.parseBoolean("true");
        bB = Boolean.valueOf(   true    );
        b = bB;
//        bB = Boolean.TRUE;
        System.out.println(b);
        System.out.println(bB);
        
    }
}
