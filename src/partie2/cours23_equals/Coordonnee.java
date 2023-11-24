package partie2.cours23_equals;

public class Coordonnee {
    private int x;
    private int y;

    public static final int X_DEFAUT = 0;
    public static final int Y_DEFAUT = 0;

    public static final int MIN_XY = Integer.MIN_VALUE;
    public static final int MAX_XY = Integer.MAX_VALUE;


    public Coordonnee() {
        this(X_DEFAUT, Y_DEFAUT);
    }

    public Coordonnee(int x, int y) {
        move(x, y);
    }

    public void move(int x, int y) {
        if (xyEstValide(x, y)) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException("x = " + x + " et y = " + y + " est invalide comme coordonnées");
        }
    }

    public void translate(int dX, int dY) {
        move(x + dX, y + dY);
    }


    public static boolean xyEstValide(int x, int y) {
        boolean estValide;
        estValide = MIN_XY <= x && x <= MAX_XY;
        estValide &= MIN_XY <= y && y <= MAX_XY;
        return estValide;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object obj) {
        Coordonnee that;

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }
        that = ((Coordonnee) obj);
        return x == that.x && y == that.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
