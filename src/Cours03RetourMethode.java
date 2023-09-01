public class Cours03RetourMethode {
    public Cours03RetourMethode() {
        testerAddition();
        testerAfficherForce();
    }

    private void testerAfficherForce() {
        afficherForce(1, 2);
        afficherForce(2, 5);
        afficherForce(7, -23);
        afficherForce(-3, 5);
        afficherForce(0, 21);
    }

    private void afficherForce(int masse, int acceleration) {
        int force;

        force = calculerForce(masse, acceleration);
        System.out.println("Avec une masse de " + masse + " et une accélération de " + acceleration + ", nous aurons une force de " + force + ".");
    }

    private int calculerForce(int masse, int acceleration) {
        int force;

        force = masse * acceleration;
        return force;
    }

    private void testerAddition() {
        afficherAddition(2, 3);
        afficherAddition(2, -3);
        afficherAddition(-3, 3);
        afficherAddition(-3, -3);
        afficherAddition(0, 3);
    }

    private void afficherAddition(int v1, int v2) {
        int somme;

        somme = calculerSomme(v1, v2);
        System.out.println(v1 + " + " + v2 + " = " + somme);
    }

    private int calculerSomme(int v1, int v2) {
        int retourSomme;

        retourSomme = v1 + v2;
        return retourSomme;
    }

    public static void main(String[] args) {
        new Cours03RetourMethode();
    }
}
