package partie2.cours18_objet;

public class Pizza {
    //Attributs ou variables d'instances
    //Pour qu'elles existent, la classe doit être instanciée
    //On les met private pour évier qu'elles soient modifiées à l'extérieur de la classe. On appelle ça l'encapsulation
    private int x;
    private int y;
    private int vitesse;
    private String couleur;
    //Constante de classe : EXISTE TOUJOURS
    //constante : valeur qui ne peut pas changer.
    //Normes : Toujours en majuscule
    //static : appartient à la classe : existe toujours (même sans instance)
    //final : la variable ne peut pas changer de valeur
    public static final int MAX_XY = 50;
    public static final int MIN_XY = -MAX_XY;
    public static final int X_DEFAUT = 0;
    public static final int Y_DEFAUT = 0;
    public static final int VITESSE_DEFAUT = 0;
    public static final String COULEUR_DEFAUT = "blanche";

    public Pizza() {
        this(X_DEFAUT, Y_DEFAUT); //this() fait référence au constructeur
    }

    public Pizza(int x, int y) {
        this(x, y, VITESSE_DEFAUT, COULEUR_DEFAUT);
    }

    public Pizza(int x, int y, int vitesse, String couleur) {
        setXY(x, y); //important pour garder la cohérence
        this.vitesse = vitesse; //variable locale est blanche et la variable d'instance est mauve
        this.couleur = couleur; //le mot clé this fait référence à l'instance courante
    }

    public void avancerX() {
        x += vitesse;
    }

    public void setXY(int x, int y) {
        if (estValideXY(x, y)) {
            this.x = x;
            this.y = y;
        } else {
            String message = "(" + x + ", " + y + ") n'est pas valide: leur valeur doit être entre [" + MIN_XY + ", " + MAX_XY + "]";
            throw new IllegalArgumentException(message);
        }
    }

    //les méthodes de validation ne sont pas liées à l'instance,
    //on doit donc les déclarer statiques (liées à la classe)
    //méthode statique : on ne peut pas accéder aux variables d'instance
    public static boolean estValideXY(int x, int y) {
        boolean estValide;

        estValide = MIN_XY <= x && x <= MAX_XY;
        estValide &= MIN_XY <= y && y <= MAX_XY;
        return estValide;
    }

    public int getX() { //accesseur
        return x;
    }

    public int getY() { //accesseur
        return y;
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
