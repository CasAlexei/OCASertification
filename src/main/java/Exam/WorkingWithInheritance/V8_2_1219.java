package Exam.WorkingWithInheritance;

public class V8_2_1219 {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        ((I1) tc).m1();
        int a = ((I1)tc).VALUE;

        TestClass tc1 = new TestClass();
        System.out.println(( ( I1) tc1).VALUE);
    }
}

class TestClass implements I1, I2 {
    public void m1() {
        System.out.println("Hello");
    }
}

interface I1 {
    int VALUE = 1;

    void m1();
}

interface I2 {
    int VALUE = 2;

    void m1();
}

