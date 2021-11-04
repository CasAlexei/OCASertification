package Tregulov.Lesson22.Pack2;

import Tregulov.Lesson22.*;


public class TestEmployee {
    public static void main(String args) {
        Test1 test = new Test1();

//        Employee emp1 = new Employee();   // not alloyed to make instance of Employee, because the class is not public
    }
}

class TestStatic {
    TestStatic(int nsa){
        this.nsa = nsa;
        this.nsstr = "constructor init";
        System.out.println("-constructor");
    }
    static {
        System.out.println("-static bloc in TestStatic class");
    }

    static int sa = 5;
    static String sstr = "hello static";

    int nsa = 10;
    String nsstr = "hello non static";

    {
        System.out.println("-non-static block in TestStatic");
    }

    public static void main(String[] args) {
//        TestStatic ts = new TestStatic(50);
        TestStatic ts1;
    }
}

class TestStaticClass{
    public static void main(String[] args){
        TestStatic ts1;
    }
}
