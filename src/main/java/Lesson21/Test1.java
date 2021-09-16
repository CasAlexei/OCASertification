package Lesson21;

public class Test1 {
    int a1 = 10;
    private String st1 = "hello";
}

class Test2{
    int b2=5;
    String st2 = "poka";
}

class TestTest{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.a1++;

        Test2 test2 = new Test2();
        test2.b2+=5;
        System.out.println(test2.b2++);
        System.out.println(test2.b2);
    }
}