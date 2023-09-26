public class Cour11Exercices {
//    o Trouver l’énoncé boolean java pour avoir true selon le cas (n et m sont des réels et c un caractère)
//
//    Ø n → [-1, 16[
//    n >= -1 && n < 16
//
//    Ø n → [1, 4] et m → ]1,4]
//    (n >= 1 && n <= 4) && (m > 1 && m <= 4)
//
//    Ø c → ['1', 'Z'[
//    c >= '1' && c < 'Z'
//
//    o Trouver l’énoncé boolean java pour avoir true si un variable nb est dans l'intervalle suivant :
//
//    Ø ]1, 10] U [20, 30[
//    (nb > 1 && nb <= 10) || (nb >= 20 && nb < 30)
//
//    o Indiquez l’affichage exact de l’appel de ces méthodes :
//
    private void exercice() {
        int i = 4;
        System.out.println("1 - i = " + i);
        while (i > 0) {
            System.out.print("2 - i = " + i);
            if (i % 2 == 0) {
                System.out.print(" - i x 2 = " + i * 2);
            } else {
                System.out.print(" - i x 3 = " + i * 3);
            }
            System.out.print('\n');
            i -= 1;
        }
        System.out.println("3 - i = " + i);
    }

//    ========================
//    1 - i = 4
//    2 - i = 4 - i x 2 = 8
//    2 - i = 3 - i x 3 = 9
//    2 - i = 2 - i x 2 = 4
//    2 - i = 1 - i x 3 = 3
//    3 - i = 0
//    ========================
//
    private void jouerAvecLEgaliteDesStrings() {
        String str1, str2;
        int i = 1;
        str1 = "abc";
        System.out.println(str1.equals("abc"));
        str1 = "abc";
        System.out.println(str1.equals("aBc"));
        str1 = "abc";
        System.out.println(str1.equalsIgnoreCase("aBc"));
        str1 = "abc";
        str2 = "abc";
        System.out.println(str1.equals(str2));
        str1 = "";
        System.out.println(str1.equals(""));
        str1 = "abc ";
        System.out.println(str1.equals("abc"));
    }

//    ========================
//    true
//    false
//    true
//    true
//    true
//    false
//    ========================
}
