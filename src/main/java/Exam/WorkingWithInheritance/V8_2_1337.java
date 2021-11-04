package Exam.WorkingWithInheritance;

public class V8_2_1337 {
}

class A {
    A() {
        System.out.println("constructor A");
        print();
    }

    void print() {
        System.out.print("A ");
    }
}

class B extends A {
    //    final int i = 4;
    int i = 4;

    B() {
        System.out.println("constructor B");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i + " ");
    }
}