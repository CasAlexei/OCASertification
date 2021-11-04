package Exam.exeptionsTest;

import java.io.FileNotFoundException;
import java.io.IOException;

public class V8_2_839 {
    public static void main(String[] args) throws IOException {
        Great g = new Amazing();
        g.doStuff();
    }
}

class Great{
    public void doStuff() throws FileNotFoundException {
    }
}

class Amazing extends Great{
    @Override
//    public void doStuff() throws IOException, IllegalArgumentException{   // compile error
    public void doStuff() throws IllegalArgumentException{
        System.out.println("All is Ok");
    }
}