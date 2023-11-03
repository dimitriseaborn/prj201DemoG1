package partie2.cours18_objet;

public class Pizza {
    //attributs ou variables d'instances
    //Pour qu'elles existent, la classe doit être instanciée
    //On les met private pour évier qu'elles soient modifiées à l'extérieur de la classe. On appelle ça l'encapsulation
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    public Pizza(int x, int y, int vitesse, String couleur) {
        this.x = x; //le mot clé this fair référence à l'instance courante
        this.y = y; //variable locale est blanche et la variable d'instance est mauve
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public void avancerX() {
        x += vitesse;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + x +
                ", y=" + y +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
