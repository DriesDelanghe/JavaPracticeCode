package oefeningenbundel1;

public class Boek {
    private String auteur;
    private String titel;
    private boolean cursusTekst = false; //kan dit boek als cursus dienen?
    private int aantalKeerUitgeleend = 0;

    public Boek(String auteur, String titel) {
        this.auteur = auteur;
        this.titel = titel;
        //default waarden voor cursusTekst en aantalKeerUitgeleend
        //this.cursusTekst = false;
        //this.aantalKeerUitgeleend = 0;
    }
    public void verhoogAantalKeerUitgeleend()
    {
        //this.aantalKeerUitgeleend = this.aantalKeerUitgeleend + 1;
        this.aantalKeerUitgeleend++;
        if (this.aantalKeerUitgeleend >= 100)
        {
            System.out.println("populair boek!");
        }
        else
        {
            System.out.println("geen populair boek");
        }
    }
    public void drukAf()
    {//testen op gelijkheid = 2 keer!!!! == schrijven
        if (this.cursusTekst == true) {
            System.out.println(this.titel + " van " + this.auteur +
                    " kan verkocht worden als cursustekst");
        }
        else
        {
            System.out.println(this.titel + " van " + this.auteur +
                    " kan niet verkocht worden als cursustekst");
        }
    }

    @Override
    public String toString() {
        return "Boek{" +
                "auteur='" + auteur + '\'' +
                ", titel='" + titel + '\'' +
                ", cursusTekst=" + cursusTekst +
                ", aantalKeerUitgeleend=" + aantalKeerUitgeleend +
                '}';
    }

    public void setAantalKeerUitgeleend(int aantalKeerUitgeleend) {
        this.aantalKeerUitgeleend = aantalKeerUitgeleend;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setCursusTekst(boolean cursusTekst) {
        this.cursusTekst = cursusTekst;
    }
}
