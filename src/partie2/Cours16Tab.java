package partie2;

import java.util.Arrays;

public class Cours16Tab {
    public Cours16Tab() {
        tester_multiplierValeurDuTab();
        tester_creerTableautEtinitialiser();
    }

    private void tester_creerTableautEtinitialiser() {
        int[] tab = creerTableauEtInitialiser(4, -1);
        System.out.println(Arrays.toString(tab));
    }

    private int[] creerTableauEtInitialiser(int longueur, int valeur) {
        int[] tab = new int[longueur];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeur;
        }
        return tab;
    }

    private void tester_multiplierValeurDuTab() {
        double[] t = {2, -3, 3.2};
        multiplierValeursDuTab(t, 2);
        System.out.println(Arrays.toString(t));
        multiplierValeursDuTab(t, 4);
        System.out.println(Arrays.toString(t));
    }

    private void multiplierValeursDuTab(double[] tableau, double multiplicateur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] *= multiplicateur;
        }
    }

    public static void main(String[] args) {
        new Cours16Tab();
    }
}
