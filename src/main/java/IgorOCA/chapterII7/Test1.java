package IgorOCA.chapterII7;


class A {
    public String str = "Hello from A, str";
    public String str1 = "Hello from A, str1";
}
class B extends A {
    private String str = "Hello from test B";
}
class C extends B{
}

public class Test1 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(((A)c).str);
        System.out.println(c.str1);    // error compilation
//        System.out.println(c.str);    // error compilation
    }
}