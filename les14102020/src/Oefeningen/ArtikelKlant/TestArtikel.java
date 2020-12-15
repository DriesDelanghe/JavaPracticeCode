package Oefeningen.ArtikelKlant;

public class TestArtikel {

    public static void main(String[] args) {

        Artikel a1 = new Artikel("Computer", 899, 21);
        Artikel a2 = new Artikel("Oortjes", 19.99, 21);
        Artikel a3 = new Artikel("appel", 0.99, 21);

        Klant k = new Klant("Van den Bosch", "2820");

        k.koop(a1);
        k.koop(a2);
        k.koop(a3);

        System.out.println(k.MaakKassa());
        System.out.println(k.toString());
        System.out.println(k);

        System.out.println(k.GoedkoopsteArtikel());
    }
}
