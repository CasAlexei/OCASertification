package Exam.javaAPI;

public class V8_2_1248 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("world").insert(0, "hello ");
        StringBuilder sb2 = new StringBuilder("world").append("123456789 ", 0, 6);
        StringBuilder sb3 = new StringBuilder();

        System.out.println(sb1);
        System.out.println(sb2);
        sb1 = null;
        System.out.println("hello world".compareTo("Hello world"));
        System.out.println(sb1);
    }
}
