import java.util.Scanner;

public class Cour06Scanner {
    public Cour06Scanner() {
        lireAuClavierEtAfficherNom();
        lireAuClavierEtAfficherPrenom();
    }

    private void lireAuClavierEtAfficherNom() {
        Scanner sc; //Classe utilitaire de lecture au clavier
        String strNom;

        sc = new Scanner(System.in); //instantiation de l'utilitaire de lecture au clavier
        System.out.print("Entrez votre nom : ");
        // Attendre que l'usager entre des caractères au clavier et appuie 'Entrée'.
        // Les caractères entrés sont affectés à la variable strNom.
        strNom = sc.nextLine();
        System.out.println("Votre nom est : " + strNom + '.');
    }

    private static void lireAuClavierEtAfficherPrenom() {
        Scanner sc = new Scanner(System.in);
        String strPrenom;
        System.out.print("Entrez votre prénom : ");
        strPrenom = sc.nextLine();
        System.out.println("Votre prénom est : " + strPrenom + '.');
    }

    public static void main(String[] args) {
        new Cour06Scanner();
    }
}
