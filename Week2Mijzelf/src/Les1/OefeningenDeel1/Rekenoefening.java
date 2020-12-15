package Les1.OefeningenDeel1;

public class Rekenoefening {

    private double getal1;
    private double getal2;
    private String bewerking;

    public Rekenoefening(double getal1, double getal2, String bewerking) {
        this.getal1 = getal1;
        this.getal2 = getal2;
        this.bewerking = bewerking;
    }

    public void SetBewerking(String bewerking){
        this.bewerking = bewerking;

        if (bewerking != "plus" && bewerking != "Plus" && bewerking != "min" && bewerking != "Min"
        && bewerking != "maal" && bewerking != "Maal"){
            System.out.println("De gevraagde bewerking is geen geldige bewerking");
        }
    }

    public void DoBewerking(){
        if(this.bewerking == "plus" || this.bewerking == "Plus"){
            double uitkomst = this.getal1 + this.getal2;
            System.out.println("De optelling van deze twee getallen bedraagt; " + uitkomst + "\n");
        }
        else if(this.bewerking == "min" || this.bewerking == "Min"){
            double uitkomst = this.getal1 - this.getal2;
            System.out.println("Het verschil van deze twee getallen bedraagt: " + uitkomst + "\n");
        }
        else if(this.bewerking == "maal" || this.bewerking == "Maal"){
            double uitkomst = this.getal1 * this.getal2;
            System.out.println("De vermenigvuldiging van deze twee getallen bedraagt: " + uitkomst + "\n");
        } else{
            System.out.println("De gevraagde bewerking is geen geldige bewerking");
        }

    }
}
