package Exam.operatorsAndConstructs;

public class V8_2_1464 {
    public static void main(String[] args) {
        LoopTest lt = new LoopTest();
        lt.printThem();
    }
}

class LoopTest{
    int k = 5;

    public boolean chekIt(int k){
        return k-->0?true:false;
    }
    public void printThem(){
        while(chekIt(k)){
            System.out.print(k--);
        }
    }

}