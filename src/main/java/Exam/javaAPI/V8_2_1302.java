package Exam.javaAPI;

public class V8_2_1302 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345678");

        sb.setLength(10);
        sb.ensureCapacity(50);
        sb.append("0123456789");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
