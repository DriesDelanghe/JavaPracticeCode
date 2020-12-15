package Oefeningen.ArtikelKlant;

import java.util.ArrayList;

public class Klant {

    private String naam;
    private String postcode;
    private ArrayList<Artikel> gekochteArtikels = new ArrayList<Artikel>();

    public Klant(String naam, String postcode) {
        this.naam = naam;
        this.postcode = postcode;
    }

    public void koop(Artikel a) {
        gekochteArtikels.add(a);
    }

    public String MaakKassa() {
        String s = this.naam + " " + this.postcode + "\n" + "artikels:" + "\n";
        double prijs = 0;
        double prijsBTW = 0;
        for (Artikel a : gekochteArtikels) {
            s += a + "\n";
            prijs += a.getNettoPrijs();
            prijsBTW += a.PrijsBerekenen();
        }
        s += "Nettoprijs: " + prijs + "\n" + "Prijs met BTW: " + prijsBTW;
        return s;
    }

    @Override
    public String toString() {
        return MaakKassa();
    }

    public String GoedkoopsteArtikel() {
        Artikel goedkoopste = new Artikel();
        double minPrijs = gekochteArtikels.get(0).PrijsBerekenen();
        for (Artikel a : gekochteArtikels) {
            if (a.PrijsBerekenen() < minPrijs) {
                minPrijs = a.PrijsBerekenen();
                goedkoopste = a;
            }
        }
        return goedkoopste.toString();
    }
}

