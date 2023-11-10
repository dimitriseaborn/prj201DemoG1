package partie2.cours20;

public class Coordonnee {
    private static final int MAX_XY = 1000;
    public static final int MIN_XY = -MAX_XY;
    private int x;
    private int y;

    public Coordonnee() {
        this(0, 0);
    }

    public Coordonnee(int x, int y) {
        move(x, y);
    }

    public static boolean estCoordoneeValide(int coordonee) {
        return MIN_XY <= coordonee && coordonee <= MAX_XY;
    }

    public void translate(int dx, int dy) {
        move(x + dx, y + dy);
    }

    public void move(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (estCoordoneeValide(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException(x + " n'est pas situé dans l'intervalle [" + MIN_XY + ", " + MAX_XY + "], impossible de set le x");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (estCoordoneeValide(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException(y + " n'est pas situé dans l'intervalle [" + MIN_XY + ", " + MAX_XY + "], impossible de set le Y");
        }
    }

    @Override
    public String toString() {
        return '(' + x + ", " + y + ')';
    }
}
