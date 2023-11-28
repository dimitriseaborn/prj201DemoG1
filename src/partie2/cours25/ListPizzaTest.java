package partie2.cours25;

import partie2.cours23_equals.Pizza;

public class ListPizzaTest {

    private ListPizza listPizza;

    public ListPizzaTest() {
        listPizza = new ListPizza();
        ajouterDesPizzas();
        //  enleverDesPizzas();
        avancerLesPizzas();
    }

    private void avancerLesPizzas() {
        listPizza.avancerLesPizzas();
        System.out.println(listPizza);
    }

    private void enleverDesPizzas() {
        listPizza.supprimerPizza(0);
        System.out.println(listPizza);

        listPizza.supprimerPizza(new Pizza(1,2,3,"jaune"));
        System.out.println(listPizza);

        listPizza.supprimerPizza(new Pizza(1,2,44,"verte"));
        System.out.println(listPizza);

    }

    private void ajouterDesPizzas() {
        System.out.println(listPizza);

        listPizza.ajouterPizza(new Pizza(1,2,1,"bleu"));
        listPizza.ajouterPizza(new Pizza(1,2,2,"rouge"));
        listPizza.ajouterPizza(new Pizza(1,2,3,"jaune"));
        listPizza.ajouterPizza(new Pizza(1,2,4,"verte"));
        listPizza.ajouterPizza(new Pizza(1,2,5,"orange"));

        System.out.println(listPizza.toString());
    }

    public static void main(String[] args) {
        new ListPizzaTest();
    }
}
