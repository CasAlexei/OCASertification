package IgorOCA.chapterII3;

import java.util.Arrays;

public class VarArgsTest {
    static void run(int ... args){
        System.out.println(Arrays.toString(args));
    }
    public static void main(String[] args) {
        run(1,2,3,4,5,6);
        int[][] arr1 = new int[5][1];
        arr1[2][0] = 5;
        System.out.println(arr1[2][0]);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[2][0]);

        int[] arr2;
        arr2 = new int[] {915, 892, 454};
        System.out.println(arr2.length);
        System.out.println(arr2[0]);
    }
}
