package Tregulov.Lesson21;

public class Animal {
    public Animal(){
        System.out.println("I am Animal");
    }

    int eyes;

    protected void drinks(){
        System.out.println("Animal drinks");
    }

    void eat(){
        System.out.println("Animal eats");
    }
}

class Pet extends Animal{
    String name;
    int paw;
    int tail;

    Pet(){
        eyes = 2;
        System.out.println("I am Pet");
    }
    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jump");
    }
}

class Dog extends Pet{
    Dog(String name){
        this.name = name;
        System.out.println("I am Dog and my name is " + name);
    }

    void play(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{
    Cat(String name){
        System.out.println("I am a Cat and my name is " + name);
    }

    void sleep(){
        System.out.println("Cat sleeps");
    }
}

class TestAnimal{
    public static void main(String[] args) {
        Dog dog = new Dog("Keks");
        dog.play();
        dog.run();
        dog.jump();

        Cat cat = new Cat("Lusea");
        cat.sleep();
        cat.run();
        cat.jump();

    }
}