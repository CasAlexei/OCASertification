package IgorOCA.chapterII7;

public class Problem7_10 {

}

abstract class Tree {
    private void grow() {
        System.out.println("Tree is growing");
    }

    public static void main(String[] args) {
        Tree tree = new Oak();
        tree.grow();
    }
}

class Oak extends Tree {
    protected void grow() {
        System.out.println("Oak is growing");
    }
}