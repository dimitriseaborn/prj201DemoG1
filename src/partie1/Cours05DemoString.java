package partie1;

public class Cours05DemoString {
    public Cours05DemoString() {
//        jouerAvecChaineDeCaracteres();
//        jouerAvecCaracteresSpeciaux();
//        testerGetStringEntreGuillemets();
//        afficherLaLongueurDUneString();
//        testerMettreEnMajusculeEtEnMinuscule();
        testerGetCaractereALIndice();
    }

    private void testerGetCaractereALIndice() {
        String str = "Bonjour le monde!";
        char c; // char est un type simple pour contenir un seul caractère

        c = str.charAt(0);
        System.out.println(c);

        afficherCaractereALIndice(str, 3);
        afficherCaractereALIndice(str, 0);
        afficherCaractereALIndice(str, 17);
    }

    private void afficherCaractereALIndice(String str, int indice) {
        String strAffichage;

        strAffichage = "Dans la chaine " + getStringEntreGuillemets(str);
        strAffichage += ", le caractère à l'indice " + indice;
        strAffichage += " est '" + str.charAt(indice) + "'.";
        System.out.println(strAffichage);
    }

    private void testerMettreEnMajusculeEtEnMinuscule() {
        String str;

        str = "Bonjour le monde";
        System.out.println(getEnMajuscule(str));
        System.out.println(getEnMinuscule(str));
    }

    private String getEnMinuscule(String str) {
        String strEnMinuscule;

        strEnMinuscule = str.toLowerCase();
        return strEnMinuscule;
    }

    private String getEnMajuscule(String str) {
        String strEnMajuscule;

        strEnMajuscule = str.toUpperCase();
        return strEnMajuscule;
    }

    private void afficherLaLongueurDUneString() {
        String str;
        int lgString;

        str = "   Allo Jean   ";
        lgString = str.length(); //retourne le nombre de caractères de str
        System.out.println(getStringEntreGuillemets(str) + " a une longueur de " + lgString);
    }

    private void testerGetStringEntreGuillemets() {
        String str;

        str = "Bonjour";
        System.out.println(getStringEntreGuillemets(str));
        str = getStringEntreGuillemets(str);
        System.out.println(str);
    }

    private String getStringEntreGuillemets(String str) {
        String strEntreGuillemets;

        strEntreGuillemets = "\"" + str + "\"";
        return strEntreGuillemets;
    }

    private void jouerAvecCaracteresSpeciaux() {
        String str;

        str = "Bonjour\nle\nmonde."; // \n -> nouvelle ligne
        System.out.println(str);
        str = "Bonjour\tle\tmonde."; // \t -> tabulation
        System.out.println(str);
        str = "\"Bonjour le monde.\""; // \" -> permet de mettre un guillemet dans ne chaine de caractères
        System.out.println(str);
    }

    private void jouerAvecChaineDeCaracteres() {
        String str;

        str = "Bonjour";
        System.out.println(str); // affiche : Bonjour
        System.out.println(str + " le "); // affiche : Bonjour le
        System.out.println(str); // affiche : Bonjour
        str = str + " le ";
        System.out.println(str); // affiche : Bonjour le
        str += "monde!!!"; //ajoute à str la chaine "monde!!!" (on préfère cette syntaxe)
        System.out.println(str); // affiche : Bonjour le monde
    }

    public static void main(String[] args) {
        new Cours05DemoString();
    }
}
