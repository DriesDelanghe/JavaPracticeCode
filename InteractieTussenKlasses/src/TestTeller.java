public class TestTeller {
    public static void main(String[] args) {
        Teller uur = new Teller(23, "uur");
        Teller minuut = new Teller(59, "minuut");
        Teller second = new Teller(59, "second");

        DigitaleKlok test = new DigitaleKlok(uur, minuut, second);

        test.verhoogSecond();
        test.verhoogMinuut();
        test.verhoogUur();



        System.out.println(test.toString());
    }
}
