package IgorOCA.TestModule;

public class Test1 {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[][] arr2 = {arr1};

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
            if (i == 5) {
                break;
            }

        }
    }
}
