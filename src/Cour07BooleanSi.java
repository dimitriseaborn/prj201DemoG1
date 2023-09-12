public class Cour07BooleanSi {
    public Cour07BooleanSi() {
//        testerBoolean();
//        testerAfficherSiUnNombreEstPositif();
        testerAfficherNoteEstReussite();
    }

    private void testerAfficherNoteEstReussite() {
        afficherNoteEstReussiteV2(80);
        afficherNoteEstReussiteV2(50);
        afficherNoteEstReussiteV2(59.99999);
        afficherNoteEstReussiteV2(60);
        afficherNoteEstReussiteV2(0);
        afficherNoteEstReussiteV2(100);
    }

    private void afficherNoteEstReussiteV2(double note) {
        String str;
        boolean estSucces;

        str = "La note " + note + " est ";
        estSucces = note >= 60;
        str += estSucces ? "une réussite" : "un échec";
        System.out.println(str);
    }

    private void afficherNoteEstReussiteV1(double note) {
        boolean estSucces;
        String str;

        estSucces = note >= 60;
        str = "La note " + note + " est ";
        if (estSucces) {
            str += "une réussite";
        } else {
            str += "un échec";
        }
        str += '.';
        System.out.println(str);
    }

    private void testerAfficherSiUnNombreEstPositif() {
        afficherSiUnNombreEstPositifOuNegatif(-1);
        afficherSiUnNombreEstPositifOuNegatif(0);
        afficherSiUnNombreEstPositifOuNegatif(1);
    }

    private void afficherSiUnNombreEstPositifOuNegatif(int nb) {
        System.out.print(nb + "est un nombre ");
        if (nb >= 0) {
            System.out.print("positif");
        } else {
            System.out.print("négatif");
        }
        System.out.println(".");
    }

    private void afficherSiUnNombreEstPositif(int nb) {
        System.out.print(nb + " est un nombre ");
        if (nb >= 0) {
            System.out.print("positif");
        }
        System.out.println(".");
    }

    private void testerBoolean() {
        int i = 0;
        System.out.println("true -> " + true);// true
        System.out.println("false -> " + false);// false
        System.out.println("2 < 3 -> " + (2 < 3));// true
        System.out.println("2 > 3 -> " + (2 > 3));// false
        System.out.println("2 == 3 -> " + (2 == 3));// false
        System.out.println("3 == 3 -> " + (3 == 3));// true
        System.out.println("2 >= 3 -> " + (2 >= 3));// false
        System.out.println("3 >= 3 -> " + (3 >= 3));// true
        System.out.println("2 <= 3 && 3 < 4 -> " + (2 <= 3 && 3 < 4));// true
        System.out.println("i <= 3 && i < 4 -> " + (i <= 3 && i < 4));// true
        System.out.println("2 == 3 && 2 < 4) -> " + (2 == 3 && 2 < 4));// false
        System.out.println("2 == 3 || 2 < 4 -> " + (2 == 3 || 2 < 4));// true
        System.out.println("2 != 3 -> " + (2 != 3));// true
        System.out.println("3 != 3 -> " + (3 != 3));// false
        System.out.println("!true -> " + !true);// false
        System.out.println("!false -> " + !false);// true
        System.out.println("!(3 == 3) -> " + !(3 == 3));// false
    }

    public static void main(String[] args) {
        new Cour07BooleanSi();
    }
}
