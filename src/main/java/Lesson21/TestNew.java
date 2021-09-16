package Lesson21;

public class TestNew {
    Test1 t1 = new Test1();
    Test2 t2 = new Test2();



}
class TestDog{
    public static void main(String[] args) {
        Dog dog = new Dog("SSS");
        dog.play();
        dog.jump();
        dog.run();
        dog.drinks();
        dog.eat();
        System.out.println("Dog has eyes: " + dog.eyes);

        Test1 t1 = new Test1();
        System.out.println(t1.a1);
    }
}
