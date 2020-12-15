public class TestDatum {

    public static void main(String[] args) {
        Datum datum1 = new Datum(12,4,2010);
        Datum datum2 = new Datum();
        Datum datum3 = new Datum(45,35,23551);

        System.out.println(datum1.toString());
        System.out.println(datum2.toString());
        System.out.println(datum3.toString());
    }
}
