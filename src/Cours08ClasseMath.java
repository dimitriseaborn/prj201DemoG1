import java.util.Scanner;

public class Cours08ClasseMath {
    public Cours08ClasseMath() {
//        tester_fonctionsClassMath();
//        tester_pow();
//        tester_sqrt();
//        testerCalculerRabaisV2();
        testerCalculerVergence();
        testerAfficherVergence();
        demanderEtAfficherVergence();
    }

    private void demanderEtAfficherVergence() {
        double longueurFocale;

        longueurFocale = lireEntier("Quelle est la longueur focale? : ");
        afficherVergence(longueurFocale);
    }

    private void testerAfficherVergence() {
        afficherVergence(10);
        afficherVergence(5);
        afficherVergence(29.2);
        afficherVergence(0.001);
        afficherVergence(-12);
    }

    private void testerCalculerVergence() {
        boolean calculerVergenceFonctionne;

        calculerVergenceFonctionne = calculerVergence(10) == 1d / 10;
        calculerVergenceFonctionne &= calculerVergence(1.2) == 1d / 1.2;
        calculerVergenceFonctionne &= calculerVergence(1000) == 1d / 1000;
        calculerVergenceFonctionne &= calculerVergence(0.01) == 1d / 0.01;
        calculerVergenceFonctionne &= calculerVergence(-2) == 1d / -2;

        System.out.print("La méthode calculerVergence ");
        System.out.println(calculerVergenceFonctionne ? "fonctionne" : "ne fonctionne pas");
    }

    private void afficherVergence(double longueurFocale) {
        System.out.println("Une longueur focale de " + longueurFocale + " donne une vergence de " + calculerVergence(longueurFocale));
    }

    private double calculerVergence(double longueurFocale) {
        double vergence;

        vergence = 1 / longueurFocale;
        return vergence;
    }

    private void testerCalculerRabaisV2() {
        boolean calculerRabaisFonctionne;

        calculerRabaisFonctionne = calculerRabais(0) == 0;
        calculerRabaisFonctionne &= calculerRabais(99.99) == 0;
        calculerRabaisFonctionne &= calculerRabais(100) == 0.02;
        calculerRabaisFonctionne &= calculerRabais(499.99) == 0.02;
        calculerRabaisFonctionne &= calculerRabais(500) == 0.04;
        calculerRabaisFonctionne &= calculerRabais(999.99) == 0.04;
        calculerRabaisFonctionne &= calculerRabais(1000) == 0.05;

        System.out.print("La méthode calculerRabais() ");
        System.out.println(calculerRabaisFonctionne ? "fonctionne" : "ne fonctionne pas");
    }

    private void testerCalculerRabaisV1() {
        afficherRabais(0);
        afficherRabais(99.999999999);
        afficherRabais(100);
        afficherRabais(499.999999999);
        afficherRabais(500);
        afficherRabais(999.999999999);
        afficherRabais(1000);
    }

    private void afficherRabais(double montant) {
        String str;
        str = "Pour un montant de " + montant + " le rabais est de " + calculerRabais(montant) + '.';
        System.out.println(str);
    }

    private double calculerRabais(double montant) {
        double rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = 0.02;
        } else if (montant < 1000) {
            rabais = 0.04;
        } else {
            rabais = 0.05;
        }
        return rabais;
    }

    private void tester_sqrt() {
        double a = 4;
        System.out.println(Math.sqrt(a));
    }

    private void tester_pow() {
        double puissance;
        double valeur;

        valeur = 3;
        puissance = 2;
        System.out.println(Math.pow(valeur, puissance)); // affiche 9.0

        valeur = 25.6;
        puissance = 2;
        System.out.println(Math.pow(valeur, puissance)); // affiche 655.3600000000001

        valeur = -3;
        puissance = 3;
        System.out.println(Math.pow(valeur, puissance)); // affiche -27.0

        valeur = 25;
        puissance = 0;
        System.out.println(Math.pow(valeur, puissance)); // affiche 1.0
    }

    private void tester_fonctionsClassMath() {
        System.out.println("PI = " + Math.PI); //affiche 3.141592653589793

        System.out.println(Math.abs(-15)); //affiche 15
        System.out.println(Math.abs(-5.7)); //affiche 5.7
        System.out.println(Math.abs(5.7)); //affiche 5.7

    }

    private int lireEntier(String question) {
        int reponse;

        reponse = Integer.parseInt(lireString(question));
        return reponse;
    }

    private String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);
        afficherQuestion(question);
        reponse = sc.nextLine();
        return reponse;
    }

    private void afficherQuestion(String str) {
        System.out.print(str);
    }

    public static void main(String[] args) {
        new Cours08ClasseMath();
    }
}
