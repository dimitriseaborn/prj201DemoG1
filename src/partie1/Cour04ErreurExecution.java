package partie1;

public class Cour04ErreurExecution {
    public Cour04ErreurExecution() {
        System.out.println("partie1.Cour04ErreurExecution");
        int i;
        String strNb;
        strNb = "123g";
        i = convertirStringEnInt(strNb);
        System.out.println(strNb + " --> " + i);
    }

    private int convertirStringEnInt(String string) {
        int nombreEnInt;

        nombreEnInt = Integer.parseInt(string);
        return nombreEnInt;
    }

    public static void main(String[] args) {
        new Cour04ErreurExecution();
    }
}
