package oefeningenbundel1;

public class Kast {
    private int hoogte;
    private int breedte;
    private int diepte;

    public Kast(int hoogte, int breedte, int diepte) {
        this.hoogte = hoogte;
        this.breedte = breedte;
        this.diepte = diepte;
    }

    public void drukAf() {
        System.out.println("De kast is :\n");
        System.out.println(this.hoogte + " hoog");
        System.out.println(this.breedte + " breed");
        System.out.println(this.diepte + " diep");
    }

    public void bereken() {
        //dit is een lokale variabele die je enkel nodig hebt in deze functie
        int oppervlakte = this.hoogte * this.breedte;
        int inhoud = this.hoogte * this.breedte * this.diepte;
        System.out.println("de oppervlakte van de kast is " + oppervlakte);
        System.out.println("de inhoud van de kast is " + inhoud);
    }

    public void wijzigDiepte(int diepte) {
        //deze functie heeft van u een nieuwe waarde voor diepte nodig
        this.diepte = diepte;
    }


    @Override
    public String toString() {
        return "Kast{" +
                "hoogte=" + hoogte +
                ", breedte=" + breedte +
                ", diepte=" + diepte +
                '}';
    }
//een setter verandert de inhoud van een private variabele
    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    public void setDiepte(int diepte) {
        this.diepte = diepte;
    }
}
