package IgorOCA.chapterII2;

public class Problem233 {
    String input = "2013";
    public void parseMe(String str) {
        int output = 0;
        try {
            String input = str;
            output = Integer.parseInt(input);
        } catch (IllegalArgumentException iae) {
            System.out.println("Wrong argument!");
        }
        System.out.println(
                "input: " + input + ", output: " + output);
    }
    public static void main(String[] args) {
        Problem233 p = new Problem233();
        p.parseMe("01230");
    }
}
