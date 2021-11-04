package Exam.dataType;

public class V8_2_1027 {
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        dataWrapper++;
        System.out.println(dataWrapper+value);
    }
}
