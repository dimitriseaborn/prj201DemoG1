package partie2.cours23_equals;

public class EqualsTests {
    public EqualsTests() {
        equalsCoordonnee_test();
//        equalsDansObjetCoordonnee();
    }

    private void equalsCoordonnee_test() {
        System.out.println(retournerVraiSiCEstLeMemeObjet());
        System.out.println(!retournerFalseSiObjetNullEnArgument());
        System.out.println(!retournerFalseSiObjetEnArgumentEstDeTypeDifferent());
        System.out.println(retournerVraiSiXetYSontEgaux());
        System.out.println(!retournerFalseSiLesXSontDifferentEtYEgaux());
        System.out.println(!retournerFalseSiLesYSontDifferentsEtXEgaux());
        System.out.println(!retournerFalseSiLesXetYsontDifferents());
    }

    private boolean retournerFalseSiLesXetYsontDifferents() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 1);

        return (c1.equals(c2));
    }

    private boolean retournerFalseSiLesYSontDifferentsEtXEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 1);

        return (c1.equals(c2));
    }

    private boolean retournerFalseSiLesXSontDifferentEtYEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(2, 2);

        return (c1.equals(c2));
    }

    private boolean retournerVraiSiXetYSontEgaux() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);

        return (c1.equals(c2));
    }

    private boolean retournerFalseSiObjetEnArgumentEstDeTypeDifferent() {
        Coordonnee c1 = new Coordonnee(1, 2);

        return c1.equals(new Pizza(1, 2, 3, "bleu"));
    }


    private boolean retournerFalseSiObjetNullEnArgument() {
        Coordonnee c1 = new Coordonnee(1, 2);

        return c1.equals(null);
    }

    private boolean retournerVraiSiCEstLeMemeObjet() {
        Coordonnee c = new Coordonnee(1, 2);
        return c.equals(c);
    }

    private void equalsDansObjetCoordonnee() {
        Coordonnee c1 = new Coordonnee(1, 2);
        Coordonnee c2 = new Coordonnee(1, 2);
        Coordonnee c3 = new Coordonnee(2, 2);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c3));
    }

    public static void main(String[] args) {
        new EqualsTests();
    }
}
