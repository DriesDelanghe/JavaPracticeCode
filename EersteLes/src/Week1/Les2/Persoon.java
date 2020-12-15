package Week1.Les2;

public class Persoon {

    private String naam;
    private String voornaam;
    private String woonplaats;

    public Persoon(String naam, String voornaam, String woonplaats) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.woonplaats = woonplaats;
    }

    public void Schrijf() {
        System.out.println(this.voornaam + " " + this.naam + " woont in " + this.woonplaats);
    }

    public void schrijfAnders(){
        System.out.println(this.voornaam + "\n" + this.naam + "\n" + this.woonplaats + "\n");
    }




}
