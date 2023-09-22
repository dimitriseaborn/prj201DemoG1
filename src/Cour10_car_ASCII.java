public class Cour10_car_ASCII {
    public Cour10_car_ASCII() {
    }

    private void jouerAvecChar() {
        char lettre;

        //lettre = "a"; //On ne peut pas mettre une chaine de caractère dans un char
        lettre = 'a'; //constante char a

        System.out.println(lettre);

        System.out.println("Canad" + lettre);
        System.out.println((int)lettre);

        System.out.println((char) (lettre + 1));
        System.out.println((char) 107); //Voir la table ASCII
        System.out.println((char) 0x062);
    }

    public static void main(String[] args) {
        new Cour10_car_ASCII();
    }
}
