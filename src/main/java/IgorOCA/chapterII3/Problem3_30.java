package IgorOCA.chapterII3;

public class Problem3_30 {
    public static void main(String[] args) {
        final String str = "String ";
        switch ( str.trim() + "!" ) {                    // line 1
            case "String " + "!":                        // line 2
                System.out.println("String !");
                break;
            case "String" + "!":                        // line 3
                System.out.println("String!");
                break;
        }
    }
}
