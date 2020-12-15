package Les1.OefeningenDeel1;

public class Persoon {

    private String naam;
    private String voornaam;
    private String woonplaats;
    private double salaris;

    public Persoon(String naam, String voornaam, String woonplaats, double salaris) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.woonplaats = woonplaats;
        this.salaris = salaris;
    }

    public void DrukAf(){
        System.out.println(voornaam + " " + naam + " woont in " + woonplaats + "\n" + "salaris: " + salaris + "\n");
    }

    public void Verhuis(String nieuweWoonplaats){
        this.woonplaats = nieuweWoonplaats;
        System.out.println("persoon is verhuisd" + "\n" + "nieuwe gegevens:");
        DrukAf();
    }

    public void VasteOpslag(){
        this.salaris = this.salaris + this.salaris/50;
        System.out.println("salaris opgeslagen met vaste percent" + "\n" + "nieuwe salaris: " + this.salaris + "\n");
    }

    public void OpslagBedrag (double opslag){
        this.salaris = this.salaris + opslag;
        System.out.println("salaris opgeslagen met " + opslag + "\n" + "nieuwe salaris: " + this.salaris + "\n");
    }

    public void OpslagPercent (double percent){
        this.salaris = this.salaris + (this.salaris*percent)/100;
        System.out.println("salaris opgeslagen met " + percent + "\n" + "nieuwe salaris: " + this.salaris + "\n");
    }

    public void OpslagPlusBonus (double opslag, double bonus) {
        this.salaris = this.salaris + opslag + bonus;
        System.out.println("salaris opgeslagen met " + opslag + " en een bonus van " + bonus
                + "\n" + "nieuwe salaris: " + this.salaris + "\n");

        this.salaris = this.salaris - bonus;
        System.out.println("bonus is maar eenmalig" + "\n" + "nieuwe salaris: " + this.salaris + "\n");
    }

}
