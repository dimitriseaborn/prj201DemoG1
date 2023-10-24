package partie1;

public class Cours11_for {
    public Cours11_for() {
        //tester_compterDe1AN();
        tester_afficherNbDeCarDansUneString();
    }

    private void tester_afficherNbDeCarDansUneString() {
        afficherNbDeCarDansUneString("Bonj", 'n'); //affiche 1
        afficherNbDeCarDansUneString("Bonjour le monde", 'a'); //affiche 0
        afficherNbDeCarDansUneString("Bonjour le monde", 'e'); //affiche 2
        afficherNbDeCarDansUneString("Bonjour le monde", 'B'); //affiche 1
        afficherNbDeCarDansUneString("", 'n');  //affiche 0
    }

    private void afficherNbDeCarDansUneString(String str, char lettreAChercher) {
        String strAffichage;

        strAffichage = "Il y a " + getNbDeCarDansUneString(str, lettreAChercher) + " caractères '";
        strAffichage += lettreAChercher + "' dans la chaine \"" + str + "\"";

        System.out.println(strAffichage);
    }

    private int getNbDeCarDansUneString(String str, char lettreAChercher) {
        int compteur;
        int longueur = str.length();
        char c;

        compteur = 0;
        for (int index = 0; index < longueur; index++) {
            c = str.charAt(index);
            if (c == lettreAChercher) {
                compteur += 1;
            }
        }
        return compteur;
    }

    private void tester_compterDe1AN() {
        compterDe1AN(4); //afficher 1, 2, 3, 4
        compterDe1AN(2); //afficher 1, 2
        compterDe1AN(1); //afficher 1
        compterDe1AN(0); //afficher (rien)
    }

    private void compterDe1AN(int nbLimite) {
        int compteur;

        System.out.print("Compter de 1 à " + nbLimite + " : ");

        //Boucle for
        //for (Initialisation du compteur; condition qui doit être vrai pour entrer et poursuivre la boucle; incrémentation du compteur)
        //1 - exécuter la partie 1 du for
        //2 - vérifier la condition de la 2e partie :
        //  -- si c'est vrai : on exécute le code à l'intérieur de la boucle
        //  -- si c'est faux : on sort de la boucle
        //3 - On exécute la 3e partie du for qui normalement modifie la condition de la partie 2.
        //4 - On retourne faire le point 2
        for (compteur = 1; compteur <= nbLimite; compteur += 1) {
            System.out.print(compteur + (compteur == nbLimite ? "" : ", "));// 1, 2, 3, 4
        }
        System.out.print("\n"); //fait un saut de ligne
    }
    public static void main(String[] args) {
        new Cours11_for();
    }
}
