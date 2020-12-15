package oefeningenbundel1;

public class Persoon {
    private String voornaam;
    private String naam;
    private String woonplaats;
    private double salaris;

    public Persoon(String voornaam, String naam, String woonplaats, double salaris) {
        this.voornaam = voornaam;
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.salaris = salaris;
    }
    public void schrijf()
    {
        System.out.println(this.voornaam+" "+this.naam+" woont in "+this.woonplaats);
    }
public void opslag2Procent()
{
    this.salaris = this.salaris + this.salaris*0.02;
}
public void opslagPercentage(double percentage)//10 = 10%, 2 = 2%
{
    this.salaris = this.salaris + this.salaris * percentage/100;
}
public void verhoogSal(double bedrag)
{
    this.salaris = this.salaris + bedrag;
}
public void verhoogSal(double bedrag, double bonus)
{
    this.salaris = this.salaris + bedrag;
    //maak een lokale werkvariabale die enkel in de functie bestaat
    double totaal = this.salaris + bonus;
    System.out.println("je verdient eenmalig "+totaal);
}
    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", naam='" + naam + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", salaris=" + salaris +
                '}';
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
//hiermee kan ik de persoon laten verhuizen
    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }
}
