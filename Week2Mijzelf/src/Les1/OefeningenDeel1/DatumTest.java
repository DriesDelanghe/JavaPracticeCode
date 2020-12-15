package Les1.OefeningenDeel1;

public class DatumTest {
    public static void main(String[] args) {
        Datum datum1 = new Datum("30", "11", "2001");
        Datum datum2 = new Datum("29", "02", "2020");

        datum1.DrukAf();
        datum2.DrukAf();
    }
}
