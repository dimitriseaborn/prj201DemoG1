package partie2.cours23_equals;

public class Pizza {
    //Attributs ou des variables d'instances
    //Pour qu'elles existent, la classe doit être instanciée avec new.
    //On les met private pour éviter qu'elles soient modifiées à l'extérieur de la classe.
    // On appelle ça l'encapsulation.
    private Coordonnee coordonnee;
    private int vitesse;
    private String couleur;

    //Constante de classe : EXISTE TOUJOURS
    //constante : valeur qui ne peut pas changer.
    //Normes : Toujours en majuscule
    //static : appartient à la classe : existe toujours (même sans instance)
    //final : la variable ne peut pas changer de valeur
    public static final int MIN_XY = -50;
    public static final int MAX_XY = -MIN_XY;

    public static final int X_DEFAUT = 0;
    public static final int Y_DEFAUT = 0;
    public static final int VITESSE_DEFAUT = 0;
    public static final String COULEUR_DEFAUT = "blanche";

    public Pizza () {
       this(X_DEFAUT, Y_DEFAUT); //this permet d'appeler un constructeur de sa classe
    }

    public Pizza(int x, int y) {
        this(x, y, VITESSE_DEFAUT, COULEUR_DEFAUT); //this permet d'appeler un constructeur de sa classe
    }

    public Pizza(int x, int y, int vitesse, String couleur) {
        this.coordonnee = new Coordonnee(); //IMPORTANT
        setXY(x, y); //important pour garder la cohérence.
        setVitesse(vitesse);
        this.couleur = couleur;
    }

    public Pizza get(){
        return new Pizza(coordonnee.getX(), coordonnee.getY(), vitesse, couleur);
    }

    public void setVitesse(int vitesse) {
        if (vitesseEstValide(vitesse)) {
            this.vitesse = vitesse;
        } else {
            throw new IllegalArgumentException(vitesse + " est une vitesse invalide");
        }
    }

    public static boolean vitesseEstValide(int vitesse) {
        return vitesse >= 0;
    }

    public void set(Pizza pizza) {
        coordonnee.move(pizza.getX(), pizza.coordonnee.getY());
        vitesse = pizza.vitesse; //pizza.vitesse fait référence à la pizza reçue en argument
        couleur = pizza.couleur; //comme on est dans la classe Pizza, pas besoin d'utiliser les accesseurs (get)
    }

    public void avancerX() {
        coordonnee.translate(vitesse, 0);
    }

    public void setXY(int x, int y) { //mutateur
        String message;

        if (estValideXY(x, y)) {
            coordonnee.move(x, y);
        } else {
            message = "(" + x + ", " + y + ") n'est pas valide: leur valeur doit être entre [" + MIN_XY + ", " + MAX_XY + "]";
            throw new IllegalArgumentException(message);
        }
    }

    //Les méthodes de validation ne sont pas liées à l'instance.
    //On doit donc les déclarer static (lié à la classe)
    //Méthode static : on ne peut pas accéder au variable d'instance
    public static boolean estValideXY(int x, int y) {
        boolean estValide;
        estValide = MIN_XY <= x && x <= MAX_XY;
        estValide &= MIN_XY <= y && y <= MAX_XY;

        return estValide;
    }

    public int getX() { //accesseur
        return coordonnee.getX(); //prend le x de l'instance courante
    }

    public int getY() { //accesseur
        return coordonnee.getY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (vitesse != pizza.vitesse) return false;
        if (!coordonnee.equals(pizza.coordonnee)) return false;
        return couleur.equals(pizza.couleur);
    }

    @Override
    public int hashCode() {
        return 0;
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
