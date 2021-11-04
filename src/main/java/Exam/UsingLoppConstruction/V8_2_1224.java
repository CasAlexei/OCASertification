package Exam.UsingLoppConstruction;

public class V8_2_1224 {
    public static void main(String[] args) {
        int i = 1, j = 10;
        int k = 1;
        do {
            System.out.println("Iteration " + k + ": i=" + i + " j=" + j);
            k++;
            if (i++ > --j) continue;
            System.out.println("2Iteration " + (k-1) + ": i=" + i + " j=" + j);
        }
        while (i < 5);
        System.out.println("i=" + i + " j=" + j);
        new Long("5");
    }
}