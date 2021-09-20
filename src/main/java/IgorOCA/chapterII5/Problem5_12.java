package IgorOCA.chapterII5;

public class Problem5_12 {
    public static void main(String[] args) {
        int i = 0;
//        for(;;) i++;                                // line 1
        if (i == Integer.MAX_VALUE)                 // line 2
            System.out.println("Done! " + ++i);
    }
}
