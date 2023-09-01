public class Cours04Rectangle {
    public Cours04Rectangle() {
        testerAireRectangle();
    }

    private void testerAireRectangle() {
        afficherAireRectangle(10, 20);
        afficherAireRectangle(320, 2);
        afficherAireRectangle(74, 0);
        afficherAireRectangle(-0, 0);
    }

    private void afficherAireRectangle(int largeur, int hauteur) {
        String str; //variable de type chaine de caractère

        str = "L'aire d'un rectangle d'une hauteur de " + hauteur;
        str += " et d'une largeur de " + largeur; //concatenation de str et la valeur
        str += " est de " + calculerAireRectangle(largeur, hauteur);
        System.out.println(str);
    }

    private int calculerAireRectangle(int hauteur, int largeur) {
        int aire;

        aire = hauteur * largeur;
        return aire;
    }

    public static void main(String[] args) {
        new Cours04Rectangle();
    }
}
