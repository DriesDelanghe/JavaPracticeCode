public class Reis {


    private double prijs;
    private String bestemming;
    private boolean annulatieVerzekering;

    public Reis(double prijs, String bestemming, boolean annulatieVerzekering) {
        this.prijs = prijs;
        this.bestemming = bestemming;
        this.annulatieVerzekering = annulatieVerzekering;
    }

    public Reis(double prijs, String bestemming) {
        this.prijs = prijs;
        this.bestemming = bestemming;
        this.annulatieVerzekering = true;
    }

    //getest op reis1, bedrag eerst verhoogt naar 1050, wordt geset naar dat bedrag
    //verhoging naar 2500 wordt niet doorgevoerd en string wordt weergegeven
    public void setPrijs(double prijs) {
        if(prijs < this.prijs*1.1) {
            this.prijs = prijs;
        }
        else {
            System.out.println("Prijs kan niet verhoogt worden met meer dan 10%");
        }
    }

    public void setBestemming(String bestemming) {
        this.bestemming = bestemming;
    }

    public void setAnnulatieVerzekering(boolean annulatieVerzekering) {
        this.annulatieVerzekering = annulatieVerzekering;
    }

    public void drukAf(){

        //reis2 geeft enkel deze lijn want annulatieVerzekering = false
        System.out.println("De reis naar " + this.bestemming + " kost " + this.prijs);

        //reis1 voert deze functie uit want annulatieVerzekering = true, berekeningen kloppen
        if(this.annulatieVerzekering){
            double verzekeringKost = this.prijs*0.05;
            double totaalKost = verzekeringKost + this.prijs;
            System.out.println("Er is een annulatieverzekering, deze kost voor deze reis " + verzekeringKost
            + "\n" + "Je betaalt in totaal: " + totaalKost + " euro");
        }
    }

    @Override
    public String toString() {
        return "TestReis{" +
                "prijs=" + prijs +
                ", bestemming='" + bestemming + '\'' +
                ", annulatieVerzekering=" + annulatieVerzekering +
                '}';
    }

    //Getest op reis 2, uitkomst: prijs = 1510
    public void verhoog10(){
        this.prijs += 10;
    }

    //getest op reis1 en reis2
    public void verhoogBedrag(double bedrag) {

        //reis1 +200, uitkomst: prijs = 1200
        if (bedrag <= this.prijs / 4) {
            this.prijs += bedrag;
        }

        //reis2 + 1000, string wordt weergegeven, prijs wordt 1875
        else{
            System.out.println("Bedragsverhoging kan maar maximaal 1/4 van de prijs zijn." + "\n" +
            "Prijs wordt verhoogd met 1/4." + "\n");
            this.prijs += this.prijs/4;
        }
    }
}


