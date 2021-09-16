package Lesson25;

public class Test2 {
    public static void main(String[] args) {
        Test10 test10= new Test10();
        Test20 test20= new Test20();
        Test30 test30= new Test30();
        Test10 test1 = new Test30();


        test10.setName("Test10new");
        test20.setName("Test20new");
        test30.setName("Test30new");
        test10.getName();
        test20.getName();
        test30.getName();
        Integer int1 = Integer.valueOf("23");
        Byte b1 = Byte.valueOf((byte)56);
        Short sh1 = Short.valueOf((short)34);
        Long l1 = Long.valueOf(56);
        Double d1 = Double.valueOf(56874);

        System.out.println(int1);
        System.out.println(b1);
        System.out.println(sh1);

    }
}

class Test10{
    private String name = "My name is Test10";
    int a = 10;
    void abc(){
        System.out.println("class test10");
    }
    public void getName(){
        System.out.println(name);
    }
    public void setName(String s){
        name = s;
    }
}
class Test20 extends Test10{
    int a = 20;
    void abc(){
        System.out.println("class test20");
    }
}
class Test30 extends Test20{
    int a = 30;
    void abc(){
        System.out.println("class test30");
    }
}