package IgorOCA.chapterII7;

public class Problem7_11 {
}

class Base {
    int type = 0;                                 // line 1

    public void run() {
    }
}

class Derived extends Base {
    public Derived() {
//    int type = 10;                                // line 2
    type = 10;                                    // line 3
    }
    int type = 1;                                 // line 4

    public void run() {
        System.out.println("running type = " + this.type);
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.run();
        System.out.println("type = " + b.type);
    }
}
