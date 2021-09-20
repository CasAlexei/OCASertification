package IgorOCA.chapterII5;

public class Problem5_19 {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F"};
        for (String e : letters) {
            if (e.equals(letters[1])) {
                continue;
            }
            System.out.print(e + " ");
            if (e.equals(letters[3])) {
                break;
            }
        }
    }
}
