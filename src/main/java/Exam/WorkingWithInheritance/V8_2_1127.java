package Exam.WorkingWithInheritance;

public class V8_2_1127 implements IInt {
    public static void main(String[] args) {
        V8_2_1127 s = new V8_2_1127();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4
        s.eat();
        s.sleep();
        IInt.run();
    }
    public void eat() {
        System.out.println("Class eat");
    }
    public void sleep() {
        System.out.println("Class sleep");
    }
}

interface IInt {
    int thevalue = 0;

    void eat();

    default void sleep() {
        System.out.println("Interface sleep");
    }
    static void run() {
        System.out.println("Interface run");
    };
}

