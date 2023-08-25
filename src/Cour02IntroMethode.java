//Configurer intelliJ pour francais: file>settings>editor>natural language

public class Cour02IntroMethode {

    //pour faire la méthode constructeur : alt + inser et sélectionner constructeur
    public Cour02IntroMethode() { //constructeur: même nom que ma classe
        System.out.println("Je suis le constructeur");
        afficherDate();
        afficherPrenomNom();
        System.out.println("Fin du constructeur");
    }

    private void afficherPrenomNom() {
        afficherPrenom();
        afficherNom();
    }

    private void afficherPrenom() {
        System.out.print("Dimitri ");
    }

    private void afficherNom() {
        System.out.println("Seaborn");
    }

    private void afficherDate() {
        System.out.println("25 aout 2023");
    }

    public static void main(String[] args) {
        System.out.println("Premiere ligne exécutée");
        new Cour02IntroMethode(); //instanciation de ma propre classe et appel du constructeur
        System.out.println("Dernière ligne exécutée");
    }
}
