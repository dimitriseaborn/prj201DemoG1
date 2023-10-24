package partie1;//ctrl+alt+l pour formatter le code

public class Cour02Calculs {
    public Cour02Calculs() {
//        afficher1Plus1V1();
//        afficher1Plus1V2();
//        afficherDesAdditionsAvecDesReels();
//        afficher2Fois3();
//        afficher2DivisePar3();
//        afficherDiviser(1, 2);
//        afficherDiviser(4, 5);
        aficherFormuleComplique();
    }

    private void aficherFormuleComplique() {
        System.out.println("1 + 2 * 3 - 4 = 3 -> " + (1 + 2 * 3 - 4));
        System.out.println("1 + 2 * (3 - 4) = -1" + (1 + 2 * (3 - 4)));


    }

    private void afficherDiviser(double dividente, double diviseur) { //il y a deux paramètres (arguments)
        double quotient;

        quotient = dividente / diviseur; //cast force l'opération à se faire en double
        System.out.println(dividente + " / " + diviseur + " = " + quotient);
    }

    private void afficher2DivisePar3() {
        double quotient;
        int dividente;
        int diviseur;

        dividente = 2;
        diviseur = 3;

        quotient = (double) dividente / diviseur; //cast force l'opération à se faire en double
        System.out.println(dividente + " / " + diviseur + " = " + quotient);
    }

    private void afficher2Fois3() {
        System.out.println("2 x 3 = " + 2 * 3);
    }

    private void afficherDesAdditionsAvecDesReels() {
        double valeur; //déclaration d'une variable locale de type réel

        valeur = 2.3; //affectation
        System.out.println("valeur = " + valeur);

        valeur = valeur + 1d;
        System.out.println("valeur = " + valeur);

    }

    private void afficher1Plus1V2() {
        int reponse; //declare une variable locale de type entier dont le nom est reponse
        reponse = 1 + 1;
        System.out.println("1 + 1 = " + reponse);
        reponse = reponse + 3;
        System.out.println("reponse + 3 = " + reponse);
    }

    private void afficher1Plus1V1() {
        System.out.print("1 + 1 = ");
        System.out.println(1 + 1);
    }

    public static void main(String[] args) {
        new Cour02Calculs();
    }
}
