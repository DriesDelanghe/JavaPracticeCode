package Les1.OefeningenDeel1;

public class Bloem {

    private String Naam;
    private String Kleur;
    private double StukPrijs;

    public Bloem(String naam, String kleur, double stukPrijs) {
        this.Naam = naam;
        this.Kleur = kleur;
        this.StukPrijs = stukPrijs;
    }

    @Override
    public String toString() {
        return Naam + " heeft als kleur " + Kleur + " en kost " + StukPrijs;
    }
}


