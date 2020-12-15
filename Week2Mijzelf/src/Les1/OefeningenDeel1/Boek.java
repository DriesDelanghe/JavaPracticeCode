package Les1.OefeningenDeel1;

public class Boek {

    private String titel;
    private String auteur;
    private boolean cursusTekst;
    private int aantalKeerUitgeleend;

    public Boek(String titel, String auteur) {
        this.titel = titel;
        this.auteur = auteur;
        this.cursusTekst = false;
        this.aantalKeerUitgeleend = 0;
    }

    public void IsCursusTekst(boolean cursusTekst){
        this.cursusTekst = cursusTekst;
    }

    @Override
    public String toString() {
        return "Boek{" +
                "titel='" + titel + '\'' +
                ", auteur='" + auteur + '\'' +
                ", cursusTekst=" + cursusTekst +
                '}';
    }

    public void BoekUitgeleend(){
        this.aantalKeerUitgeleend = this.aantalKeerUitgeleend + 1;
    }

    public void BoekUitgeleendBoost(int aantalKeerUitgeleend){
        this.aantalKeerUitgeleend = this.aantalKeerUitgeleend + aantalKeerUitgeleend;
    }


    public void Print(){

        System.out.println("boek: " + this.titel + " van " + this.auteur);
        if(!cursusTekst){
            System.out.println(this.titel + " van " + this.auteur
            + " kan niet gebruikt worden als cursustekst");
        }
        else{
            System.out.println(this.titel + " van " + this.auteur
                    + " is een cursustekst");
        }

        if(this.aantalKeerUitgeleend >= 100){
            System.out.println(this.titel + " van " + this.auteur
            + " is een populair boek");
        }
        System.out.println("\n");

    }
}
