package Oefeningen.Magazijn;

public class Product {

    private String omschrijving;
    private int aantalInVoorraad;
    private double prijs;

    public Product(String omschrijving, int aantalInVoorraad, double prijs) {
        this.omschrijving = omschrijving;
        this.aantalInVoorraad = aantalInVoorraad;
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getAantalInVoorraad() {
        return aantalInVoorraad;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    @Override
    public String toString() {
        return "Oefeningen.Magazijn.Product{" +
                "omschrijving='" + omschrijving + '\'' +
                ", aantalInVoorraad=" + aantalInVoorraad +
                ", prijs=" + prijs +
                '}';
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void verhoogPrijs(double percent) {

        this.prijs += this.prijs * percent / 100;
    }
}
