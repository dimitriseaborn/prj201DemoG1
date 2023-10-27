package partie2;

public class Cours17_tableau2D {
    public Cours17_tableau2D() {
        jouerAvecTableaux2D();
    }

    private void jouerAvecTableaux2D() {
        int[][] matrice = {{1, 3, 4}, {2, -1, 7}};

        afficher(matrice);
    }

    private static void afficher(int[][] matrice) {
        for (int ligne = 0; ligne < matrice.length; ligne++) {
            for (int colonne = 0; colonne < matrice[ligne].length; colonne++) {
                System.out.printf("matrice[%1$s][%2$s] = %3$s\n", ligne, colonne, matrice[ligne][colonne]);
            }
        }
    }

    public static void main(String[] args) {
        new Cours17_tableau2D();
    }
}
