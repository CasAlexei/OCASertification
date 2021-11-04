package Exam.operatorsAndConstructs;

public class V8_2_1367 {
    static int max(int x, int y){
        if(x > y) return x;
        return y;
//        return (if(x > y) {return x;} else {return y;});
    }

    public static void main(String[] args) {
        System.out.println(max(5, 20));
    }
}
