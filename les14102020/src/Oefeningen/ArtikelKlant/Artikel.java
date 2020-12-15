package Oefeningen.ArtikelKlant;

public class Artikel {

    private String omschrijving;
    private double nettoPrijs;
    private double BTWPercentage;

    public Artikel(String omschrijving, double nettoPrijs, double BTWPercentage) {
        this.omschrijving = omschrijving;
        this.nettoPrijs = nettoPrijs;
        this.BTWPercentage = BTWPercentage;
    }

    public Artikel() {
    }

    public double getNettoPrijs() {
        return nettoPrijs;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public void setNettoPrijs(double nettoPrijs) {
        this.nettoPrijs = nettoPrijs;
    }

    public void setBTWPercentage(double BTWPercentage) {
        this.BTWPercentage = BTWPercentage;
    }

    public double PrijsBerekenen(){
        double prijs = this.nettoPrijs;
        prijs += prijs*BTWPercentage/100;

        return prijs;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "omschrijving='" + omschrijving + '\'' +
                ", nettoPrijs=" + nettoPrijs +
                ", BTWPercentage=" + BTWPercentage +
                '}';
    }
}
