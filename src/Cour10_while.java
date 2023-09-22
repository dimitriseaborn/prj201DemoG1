public class Cour10_while {
    public Cour10_while() {
        tester_compterDe1AN();
        tester_afficherLeNbDeCarDansUneString();
    }

    private void tester_afficherLeNbDeCarDansUneString() {
        afficherNbDeCarDansUneString("Bonjour", 'n'); //affiche 1
        afficherNbDeCarDansUneString("Bonjour le monde", 'a'); //affiche 0
        afficherNbDeCarDansUneString("Bonjour le monde", 'e'); //affiche 2
        afficherNbDeCarDansUneString("Bonjour le monde", 'B'); //affiche 1
        afficherNbDeCarDansUneString("", 'n');  //affiche 0
    }

    private void afficherNbDeCarDansUneString(String str, char lettreAChercher) {
        int compteur = getNbDeCarDansUneString(str, lettreAChercher);
        System.out.printf("Dans \"%1$s\", il y a %2$s fois la lettre '%3$s'\n", str, compteur, lettreAChercher);
    }

    private static int getNbDeCarDansUneString(String str, char lettreAChercher) {
        int compteur = 0;
        int index = 0;

        while (index < str.length()) {
            if (str.charAt(index) == lettreAChercher) {
                compteur++;
            }
            index++;
        }
        return compteur;
    }

    private void tester_compterDe1AN() {
        compterDe1AN(4);
        compterDe1AN(2);
        compterDe1AN(1);
        compterDe1AN(0);
    }

    private void compterDe1AN(int nbLimite) {
        int compteur;

        System.out.println("Compter de 1 à " + nbLimite + " : ");
        compteur = 1;
        while (compteur <= nbLimite) {
            System.out.print(compteur++ + (compteur > nbLimite ? "" : ", "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Cour10_while();
    }
}
