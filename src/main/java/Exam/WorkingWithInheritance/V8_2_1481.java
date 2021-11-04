package Exam.WorkingWithInheritance;

public class V8_2_1481 implements I1482{
    public static void main(String[] args) {
        I1481.valid();
        I1482 ii = new V8_2_1481();
        ii.valid();
        ii.invalid();
        int i = int81;
    }
}

interface Account {
    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {
    //INSERT CODE HERE }
}

interface I1481 {
    int int81 = 10;
    public default void invalid() { }
    public static void valid() { } //Can be called only using I.valid();
//    String getName();
}

interface I1482 extends I1481 {
//    public static void invalid() { } //WILL NOT COMPILE
    public default void valid() { }   //this is ok. it is another method
//    String gateName();
}