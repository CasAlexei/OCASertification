package IgorOCA.chapterII3;

public class Problem3_6 {
    public static void main(String[] args) {
        int a = 19;
        boolean bool1 = false, bool2 = true;
        bool1 = ( 1.5 != (float) 1.5 ) || ( bool1 = true );
        bool2 = ( ++a == a++ ) && ( !bool1 );
        System.out.println("bool1:"+ bool1 + ", bool2:" + bool2);
    }
}
