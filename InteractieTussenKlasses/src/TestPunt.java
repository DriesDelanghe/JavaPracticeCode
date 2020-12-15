public class TestPunt {
    public static void main(String[] args) {
        Punt punt1 = new Punt(10,10);
        Punt punt2 = new Punt(20,30);

        Lijnstuk lijnstuk1 = new Lijnstuk(punt1, punt2);

        System.out.println(punt1);
        System.out.println(punt2);

        System.out.println(lijnstuk1);
        System.out.println(lijnstuk1.afstand());
    }
}
