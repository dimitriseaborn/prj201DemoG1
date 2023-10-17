public class Cours14_tableaux {
    public Cours14_tableaux() {
        jouerAvecTableau();
    }

    private void jouerAvecTableau() {
        int[] notes; //declaration d'une variable qui réfère à un tableau de int.
        notes = new int[3]; //initialisation de la variable 'notes' avec la création d'un tableau de 3 éléments

        notes[0] = 19; //écrire la valeur 19 à l'indice 0
        notes[1] = 20; //écrire la valeur 20 à l'indice 1
        notes[2] = 15; //écrire la valeur 15 à l'indice 2
        //notes[3] = 20; //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        System.out.println("notes[0] = " + notes[0]); //lire la valeur à l'indice 0
        System.out.println("notes[1] = " + notes[1]); //lire la valeur à l'indice 1
        System.out.println("notes[2] = " + notes[2]); //lire la valeur à l'indice 2

        for (int i = 0; i < notes.length; i++) {
            System.out.println("notes[" + i + "] = " + notes[i]); //lire la valeur à l'indice i
        }

        afficher(notes);

        initialiserTableau(notes, 0);
    }

    private void initialiserTableau(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeur;
        }
    }

    private void afficher(int[] tab) {
        System.out.print('[');
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ((i == tab.length - 1) ? "" : ", ")); //lire la valeur à l'indice i
        }
        System.out.println(']');
    }

    public static void main(String[] args) {
        new Cours14_tableaux();
    }
}
