package IgorOCA.chapterII5;

public class Problem5_16 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        int a = 0;
        for (String e: arr) {
            while (a < arr.length) {
                System.out.print(a);
                a++;
                break;
            }
        }
    }
}
