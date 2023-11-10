package partie2.cours20;

public class Coordonnee_test {
    public Coordonnee_test() {
        Coordonnee c = new Coordonnee();
        System.out.println(c);
        c.move(10, 5);
        System.out.println(c);
        c.translate(100, 50);
        System.out.println(c);
    }

    public static void main(String[] args) {
        new Coordonnee_test();
    }
}
