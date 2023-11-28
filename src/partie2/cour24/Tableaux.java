package partie2.cour24;

import java.util.Arrays;

public class Tableaux {
    public Tableaux() {
        tester_insererTableau();
    }

    private void tester_insererTableau() {
        System.out.println(Arrays.toString(insererTableau(new int[]{0, 1, 2, 3, 4}, new int[]{10, 11}, 5)));
        try {
            System.out.println(Arrays.toString(insererTableau(new int[]{4, 8, 7, 5}, new int[]{7, -5}, 12)));
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
        System.out.println(Arrays.toString(insererTableau(new int[]{4, 8, 7, 5}, new int[]{7, -5}, 2)));
        System.out.println(Arrays.toString(insererTableau(new int[]{0, 1, 2, 3, 4}, new int[]{10, 11}, 0)));
        System.out.println(Arrays.toString(insererTableau(new int[]{}, new int[]{}, 0)));
    }

    public static int[] insererTableau(int[] tab1, int[] tab2, int index) {
        int[] tabRetour = new int[tab1.length + tab2.length];

        //          index     index + tab2.length
        //------------|-------------|------------
        //    tab1         tab2          tab1
        for (int i = 0; i < index; i++) {
            tabRetour[i] = tab1[i];
        }
        for (int i = index; i < tab2.length + index; i++) {
            tabRetour[i] = tab2[i - index];
        }
        for (int i = index + tab2.length; i < tabRetour.length; i++) {
            tabRetour[i] = tab1[i - tab2.length];
        }
        return tabRetour;
    }

    public static void main(String[] args) {
        new Tableaux();
    }
}
