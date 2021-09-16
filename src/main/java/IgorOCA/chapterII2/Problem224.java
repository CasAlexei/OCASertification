package IgorOCA.chapterII2;

public class Problem224 {
    private String theme;
    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public static void main (String[] args) {
        Problem224 nb1 = new Problem224();
        Problem224 nb2 = new Problem224();
        nb1.setTheme(null);
        nb2.setTheme("Darcula");
        System.out.print(nb1.getTheme() + " : " + nb2.getTheme());
    }
}
