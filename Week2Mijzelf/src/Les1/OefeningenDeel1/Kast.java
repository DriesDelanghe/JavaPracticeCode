package Les1.OefeningenDeel1;

public class Kast {

    private int hoogte;
    private int breedte;
    private int diepte;


    public Kast(int hoogte, int breedte, int diepte) {
        this.hoogte = hoogte;
        this.breedte = breedte;
        this.diepte = diepte;
    }

    public void drukOverzicht() {
        System.out.println("De kast is:" + "\n" + "\n" + hoogte + " hoog" + "\n" + breedte +
                " breed" + "\n" + diepte + " diep" + "\n"
                + "Oppervlakte vooraanzicht: " + berekenOppervlak() +"\n" + "Inhoud kast: " + berekenInhoud()
                + "\n" + "\n");
    }



   private int berekenOppervlak() {
        int vooraanzicht = this.hoogte * this.breedte;
        return vooraanzicht;
    }

    private int berekenInhoud() {
        int inhoud = this.hoogte * this.breedte * this.diepte;
        return inhoud;
    }

}
