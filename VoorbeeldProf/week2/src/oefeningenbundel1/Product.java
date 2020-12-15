package oefeningenbundel1;

public class Product {
    private String naam;
    private double prijs;

    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }
    public void verhoogBedrag(double bedrag)
    {
        this.prijs = this.prijs + bedrag;
    }
    public void verhoogEen()
    {
        this.prijs = this.prijs + 1;
    }
    public void verdubbel()
    {
        this.prijs = this.prijs * 2;
    }
    public void halveer()
    {
        this.prijs = this.prijs / 2;
    }
    public void vermeerder10 ()
    {
        this.prijs = this.prijs * 1.1;
    }
    public void verminder20 ()
    {
        this.prijs = this.prijs * 0.8;
    }

    @Override
    public String toString() {
        return "Product{" +
                "naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
}
