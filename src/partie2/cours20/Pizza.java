package partie2.cours20;

public class Pizza {
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
    //Attributs ou variables d'instances
    //Pour qu'elles existent, la classe doit être instanciée
    //On les met private pour évier qu'elles soient modifiées à l'extérieur de la classe. On appelle ça l'encapsulation
    private final Coordonnee coordonnee;
    private final int vitesse;
    private final String couleur;

    public Pizza() {
        this(X_DEFAUT, Y_DEFAUT); //this() fait référence au constructeur
    }

    public Pizza(int x, int y) {
        this(x, y, VITESSE_DEFAUT, COULEUR_DEFAUT);
    }

    public Pizza(int x, int y, int vitesse, String couleur) {
        this.coordonnee = new Coordonnee();
        setXY(x, y); //important pour garder la cohérence
        this.vitesse = vitesse; //variable locale est blanche et la variable d'instance est mauve
        this.couleur = couleur; //le mot clé this fait référence à l'instance courante
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

    public Pizza get() {
        return new Pizza(coordonnee.getX(), coordonnee.getY(), vitesse, couleur);
    }

    public void avancerX() {
        coordonnee.translate(vitesse, 0);
    }

    public void setXY(int x, int y) {
        if (estValideXY(x, y)) {
            coordonnee.move(x, y);
        } else {
            String message = "(" + x + ", " + y + ") n'est pas valide: leur valeur doit être entre [" + MIN_XY + ", " + MAX_XY + "]";
            throw new IllegalArgumentException(message);
        }
    }

    public int getX() { //accesseur
        return coordonnee.getX();
    }

    public int getY() { //accesseur
        return coordonnee.getY();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
