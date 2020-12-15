package Oefeningen.Magazijn;

public class TestMagazijn {

    public static void main(String[] args) {

        Product banaan = new Product("banaan", 4, 0.89);
        Product appel = new Product("appel", 500, 0.65);
        Product kers = new Product("kers", 3, 1.99);

        Magazijn kontich = new Magazijn("2550");

        kontich.VoegToe(banaan);
        kontich.VoegToe(appel);
        kontich.VoegToe(kers);

        System.out.println(kontich);
        kontich.toonLijstAanTeVullen();
    }
}
