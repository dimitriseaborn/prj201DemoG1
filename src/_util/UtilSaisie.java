package _util;

import java.util.Scanner;

public class UtilSaisie {
    public static String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);
        System.out.print(question + ' '); //Éviter que la réponse soit collée à la question
        reponse = sc.nextLine();
        return reponse;
    }

    public static int lireInt(String question) {
        return lireEntier(question);
    }

    public static int lireEntier(String question) {
        int reponse;

        reponse = Integer.parseInt(lireString(question));
        return reponse;
    }
}
