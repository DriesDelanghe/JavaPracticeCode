package OefProf;

public class Boek {

    private String ISBNnr;
    private String titel;
    private double prijs;

    public Boek(String ISBNnr, String titel, double prijs) {
        this.ISBNnr = ISBNnr;
        this.titel = titel;
        this.prijs = prijs;
    }

    public String getISBNnr() {
        return ISBNnr;
    }

    public void setISBNnr(String ISBNnr) {
        this.ISBNnr = ISBNnr;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Boek{" +
                "ISBNnr='" + ISBNnr + '\'' +
                ", titel='" + titel + '\'' +
                ", prijs=" + prijs +
                '}';
    }


}
