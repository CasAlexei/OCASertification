package Exam.exeptionsTest;

public class Test1 {
}

abstract class Calculator{
    abstract void calculate();

    public static void main(String[] args) {
        System.out.println("calculating");
        Calculator c = null;
        c.calculate();
    }
}