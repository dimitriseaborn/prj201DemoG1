package partie2.cours25;

import partie2.cours23_equals.Pizza;

import java.util.ArrayList;

public class ListPizza {
    private ArrayList<Pizza> lPizza;

    public ListPizza() {
        lPizza = new ArrayList<>();
    }

    public void avancerLesPizzas() {
        for (int i = 0; i < lPizza.size(); i++) {
            lPizza.get(i).avancerX();
        }
    }

    public void ajouterPizza(Pizza p) {
        lPizza.add(p);
    }

    public void supprimerPizza(int index) {
        lPizza.remove(index);
    }

    public void supprimerPizza(Pizza p) {
        lPizza.remove(p);
    }

    @Override
    public String toString() {
        return "ListPizza{" + lPizza.toString() + '}';
    }
}
