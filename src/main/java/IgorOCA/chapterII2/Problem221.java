package IgorOCA.chapterII2;

public class Problem221 {
    int iVar;
    static int cVar;
    void setFields(){
        this.iVar = 22;
        this.cVar = 22;
    }
    public static void main(String[] args) {
        Problem221 of = new Problem221();
        of.iVar = 100;
        Problem221.cVar = 200;
//        iVar = 200;
//        cVar = 300;
//        this.iVar = 200;
//        this.cVar = 400;
        of.iVar = 100;
        of.cVar += 200;
        Problem221.cVar += 300;
        of.setFields();
        System.out.println("iVar=" + of.iVar + ", cVar=" + of.cVar);
    }
}
