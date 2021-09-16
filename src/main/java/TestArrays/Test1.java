package TestArrays;

public class Test1 {
    public static void main(String[] args) {
        int []array1 = new int[5];

        for(int i=0; i<array1.length; i++) {
            System.out.println(array1[i]);
        }

        String [] array2 = {"a", "b", "c"};
        for (String s:array2) {
            System.out.println(s);
        }

        int [][] arrayM = new int[3][3];
        System.out.println(arrayM[0][0]);

        String str1 = new String(new char[]{'q', 'w', 'd', 'v', 't'});

    }
}
