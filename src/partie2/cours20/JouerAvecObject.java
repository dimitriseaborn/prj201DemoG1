package partie2.cours20;

public class JouerAvecObject {

    public JouerAvecObject() {
//        jouerAvecTableauDObjets1();
//        jouerAvecPizzaEtObject1();
        jouerAvecPizzaEtObject();
    }

    private void jouerAvecPizzaEtObject() {
        Object[] tObjets = {new Pizza(1,2,4,"bleu"), new Coordonnee(5,6), 12, 1.0, false, 1.55f, 12l};

        Double d = 1.3; //Double est la classe enveloppe du type primitif double
        for (int i = 0; i < tObjets.length; i++) {
            System.out.println(tObjets[i].toString() + " - " + tObjets[i].getClass().getSimpleName());
        }
    }

    private void jouerAvecTableauDObjets1() {
        Object[] tObjects;

        tObjects = new Object[3];
        tObjects[0] = new Pizza(1, 2, 4, "Bleu");
        tObjects[1] = new Coordonnee(5, 6);
        tObjects[2] = "abc";
        for (int i = 0; i < tObjects.length; i++) {
            System.out.println(tObjects[i]);
        }
    }

    private void jouerAvecPizzaEtObject1() {
        Pizza p;
        Object o;

        p = new Pizza(1,2,4,"bleu");
        p.hashCode(); //On a accès aux méthodes de la classe Object parce que toutes les classes héritent d'Object
        System.out.println(p);
        o = p;
        ((Pizza)o).avancerX();//Cast obligatoire : il n'y a pas d'avancerX dans Object
        System.out.println(o.toString());//À l'exécution, on utilise le toString de la classe Pizza
        System.out.println(p.toString());//o & p pointe sur la même instance. Donc cette lige affiche la même chose que la précédente
    }

    public static void main(String[] args) {
        new JouerAvecObject();
    }
}
