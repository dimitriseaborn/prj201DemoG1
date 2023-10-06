public class Cour13 {
    public Cour13() {
        tester_inverserString();
        tester_getStringCarre();
    }

    public void tester_inverserString() {
        System.out.println(inverserString("abC").equals("Cba"));
        System.out.println(inverserString("").equals(""));
        System.out.println(inverserString("54321 $%?").equals("?%$ 12345"));
    }

    private String inverserString(String str) {
        String strRetour = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRetour += str.charAt(i);
        }
        return strRetour;
    }

    private void tester_getStringCarre() {
        System.out.println(getStringCarre(1));
        System.out.println(getStringCarre(2));
        System.out.println(getStringCarre(3));
    }

    private String getStringCarre(int taille) {
        String str = "";
        for (int i = 1; i <= taille; i++) {
            for (int j = 1; j <= taille; j++) {
                str += j + String.valueOf(i) + ' ';
            }
            str += '\n';
        }
        return str;
    }


    public static void main(String[] args) {
        new Cour13();
    }
}
