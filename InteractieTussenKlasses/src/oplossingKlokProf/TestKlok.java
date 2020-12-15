package oplossingKlokProf;

public class TestKlok {
    public static void main(String[] args) {

        Klok k1 = new Klok(23,59,59);

        k1.verhoogSeconde();
        k1.verhoogMinuut();
        k1.verhoogUur();

        System.out.println(k1);
    }
}
