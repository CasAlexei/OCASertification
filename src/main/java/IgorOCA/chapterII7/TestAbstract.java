package IgorOCA.chapterII7;

public class TestAbstract implements Inter1 {
    @Override
    public void swim() {
        System.out.println("implement method swim() from interface");
    }

    @Override
    public void run() {
        System.out.println("implement method run() from interface");
    }

    @Override
    public void allMustHave() {
        System.out.println("method override in TestAbstract class");
    }

    public static void main(String[] args) {
        TestAbstract obj = new TestAbstract();
        obj.run();
        obj.swim();
        Inter1.staticMethod();
//        obj.staticMethod(); // error compilation

        obj.allMustHave();
    }
}

interface Inter1 {
    default void allMustHave() {
        System.out.println("this method from interface all must have");
    }
    static void staticMethod(){
        System.out.println("static method from interface");
    }

    void run();

    void swim();
}

abstract class Test10 implements Inter1 {
    public void run1() {
    }

    abstract void jump();
}
