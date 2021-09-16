package Lesson211;

import Lesson21.Animal;

public class Dog extends Animal {
    Dog(){
        System.out.println("Constructor Dog");
    }

}

class TestDog{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
}
