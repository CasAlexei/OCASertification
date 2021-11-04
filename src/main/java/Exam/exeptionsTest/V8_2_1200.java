package Exam.exeptionsTest;

public class V8_2_1200 {
    public float parseFloat( String s ){
        float f = 0.0f;      // 1
        try{
            f = Float.valueOf( s ).floatValue();    // 2
            return f ;      // 3
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;    // 4
//            return f;     // 5
        }
        finally {
//            return f;     // 6
        }
        return f ;    // 7
    }
    public static void main(String[] args) {
        if (0<0)
            System.out.println("hello");
    }
}
