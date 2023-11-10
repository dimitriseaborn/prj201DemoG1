package partie2.cours20;

import _util.UtilSaisie;

public class JouerAvecPizza {
    public JouerAvecPizza() {
        //jouerAvecUnePizza();
        //jouerAvecPlusieursPizzas();
        //jouerAvecPizza();
        //saisirUnePizzaEtAfficher();
        //testerConstructeurs();
        tester_getPizza();
    }

    public static void main(String[] args) {
        new JouerAvecPizza();
    }

    private void tester_getPizza() {
        Pizza p1;
        Pizza p2;

        p1 = new Pizza(1, 2, 4, "rouge");
        System.out.println(p1);
        p2 = p1.get();
        System.out.println(p2);
        p2.avancerX();
        System.out.println(p1);
        System.out.println(p2);
    }

    private void testerConstructeurs() {
        Pizza p;

        p = new Pizza();
        System.out.println(p);
        p = new Pizza(1, 2);
        System.out.println(p);
    }

    private void saisirUnePizzaEtAfficher() {
        Pizza p;
        int x;
        int y;
        boolean estInvalide;

        do {
            x = UtilSaisie.lireEntier("Donner le x de la pizza :");
            y = UtilSaisie.lireEntier("Donner le y de la pizza :");
            estInvalide = !Pizza.estValideXY(x, y);
            if (estInvalide) {
                System.out.println("(" + x + ", " + y + ") n'est pas valide: leur valeur doit être entre [" + Pizza.MIN_XY + ", " + Pizza.MAX_XY + "]");
            }
        } while (estInvalide);
        p = new Pizza(x, y, 5, "bleu");
        System.out.println(p);
    }

    private void jouerAvecPizza() {
        Pizza p; //type complexe vs type primitif

        p = new Pizza(4, 2, 5, "rouge");
        System.out.println(p);
        p.setXY(5, p.getY());
        System.out.println(p);
        p.setXY(16, 0);
        System.out.println(p);
    }

    private void jouerAvecPlusieursPizzas() {
        Pizza[] tabPizza = new Pizza[4];
        String[] couleurs = {"rouge", "bleu", "jaune", "blanc"};

        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i] = new Pizza(i * 10, i * 3, 2, couleurs[i]);
        }
        afficher(tabPizza);
        avancer(tabPizza);
        afficher(tabPizza);
    }

    private void avancer(Pizza[] tabPizza) {
        for (int i = 0; i < tabPizza.length; i++) {
            tabPizza[i].avancerX();
        }
    }

    private void afficher(Pizza[] tabPizza) {
        for (int i = 0; i < tabPizza.length; i++) {
            System.out.println(tabPizza[i]);
        }
    }

    private void jouerAvecUnePizza() {
        Pizza p; //type complexe vs type primitif
        String s = "";

        p = new Pizza(4, 2, 5, "rouge");
        System.out.println(p);
        p.avancerX();
        System.out.println(p);
        p.avancerX();
        System.out.println(p);
        //    p.y = 111; //y pas accessible. Il est privé
        System.out.println(p);
    }
}