package partie2;

import java.util.Arrays;

public class Cours17_tableaux {
    public Cours17_tableaux() {
        tester_fusionnerTableau();
    }

    private void tester_fusionnerTableau() {
        int[] tab1;
        int[] tab2;

        tab1 = new int[]{1, 2, 3};
        tab2 = new int[]{1, 3, 5, 7};
        System.out.println(Arrays.toString(tab1) + Arrays.toString(tab2) + " -> " + Arrays.toString(fusionnerTableau(tab1, tab2)));
        tab1 = new int[]{2, -4, 8};
        tab2 = new int[]{1, 1, 2};
        System.out.println(Arrays.toString(tab1) + Arrays.toString(tab2) + " -> " + Arrays.toString(fusionnerTableau(tab1, tab2)));
        tab1 = new int[]{1, 2, 3};
        tab2 = new int[]{};
        System.out.println(Arrays.toString(tab1) + Arrays.toString(tab2) + " -> " + Arrays.toString(fusionnerTableau(tab1, tab2)));
    }

    private int[] fusionnerTableau(int[] tab1, int[] tab2) {
        int[] tabRetour = new int[tab1.length + tab2.length];

        for (int i = 0; i < tab1.length; i++) {
            tabRetour[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tabRetour[i + tab1.length] = tab2[i];
        }
        return tabRetour;
    }

    public static void main(String[] args) {
        new Cours17_tableaux();
    }
}
