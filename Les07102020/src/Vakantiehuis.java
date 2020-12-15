public class Vakantiehuis {

    private double prijsPerWeek;
    private double kortingspercentage2;
    private double kortingspercentage3;
    private int maxAantalPersonen;
    private double ToeristenBelastingPerPersoonPerWeek;

    public Vakantiehuis(double prijsPerWeek, double kortingspercentage2, double kortingspercentage3,
                        int maxAantalPersonen, double toeristenBelastingPerPersoonPerWeek) {
        this.prijsPerWeek = prijsPerWeek;
        this.kortingspercentage2 = kortingspercentage2;
        this.kortingspercentage3 = kortingspercentage3;
        this.maxAantalPersonen = maxAantalPersonen;
        ToeristenBelastingPerPersoonPerWeek = toeristenBelastingPerPersoonPerWeek;
    }

    public double reserveer(int aantalPersonen, int aantalWeken){
        double prijs;
        if(aantalPersonen <= maxAantalPersonen){
            if(aantalWeken==1){
                prijs = this.prijsPerWeek;
            }else if(aantalWeken ==2){
                prijs = this.prijsPerWeek + (this.prijsPerWeek*(1-kortingspercentage2));
            }else if( aantalWeken >= 3){
                prijs = this.prijsPerWeek + (this.prijsPerWeek*(1-kortingspercentage2))
                        + (this.prijsPerWeek*(1-kortingspercentage3))*(aantalWeken-2);
            }else{
                prijs = 0;
                System.out.println("You good?");
            }
        prijs += prijs*0.01 + this.ToeristenBelastingPerPersoonPerWeek*aantalPersonen*aantalWeken;

        }else{
            System.out.println("Max aantal personen overschreden");
            prijs = 0;
        }

        return prijs;
    }
}
