package Exam.UsingLoppConstruction;

public class V8_2_1057 {
    public static void main(String[] args) {
        crazyLoop();
    }
    static void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            JILL:
            if (c > 3) break JILL;
            else c++;
        }
    }
}
