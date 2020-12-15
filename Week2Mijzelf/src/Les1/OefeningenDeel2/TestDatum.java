package Les1.OefeningenDeel2;

public class TestDatum {
    public static void main(String[] args) {
        Datum datum1 = new Datum(31,12,1960);
        System.out.println(datum1.toString());
        Datum datum2 = new Datum();
        System.out.println(datum2.toString());
    }
}
