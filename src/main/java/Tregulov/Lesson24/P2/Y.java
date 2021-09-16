package Tregulov.Lesson24.P2;

import Tregulov.Lesson24.P1.*;

public class Y extends X {
    public void abc(){
        System.out.println("Y");
    }

    public void def(){
        Y y = new Y();
        y.abc();
    }

    public void hgi(){
        X x = new Y();
//        x.abc();        // ERROR COMPILATION
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.hgi();
    }
}
