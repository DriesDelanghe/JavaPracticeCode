package oefeningenbundel1;

public class Berekening {
    private int getal1;
    private int getal2;
    private String bewerking; //maal, plus of min

    public Berekening(int getal1, int getal2, String bewerking) {
        this.getal1 = getal1;
        this.getal2 = getal2;
        this.bewerking = bewerking;
    }

    @Override
    public String toString() {
        return "Berekening{" +
                "getal1=" + getal1 +
                ", getal2=" + getal2 +
                ", bewerking='" + bewerking + '\'' +
                '}';
    }
    public void bewerkingMaken()
    {
        //als je 2 strings wil vergelijken, dan moet je equals gebruiken en geen ==
        double resultaat;
        //lokale variabele = een werkvar. die enkel nodig en gekend is in deze functie
        if (this.bewerking.equals("maal"))
        {
            resultaat = getal1 * getal2;
            System.out.println(getal1 + "*" + getal2+"="+resultaat);
        }
        else
        {
            if (this.bewerking.equals("plus"))
            {
                resultaat = getal1 + getal2;
                System.out.println(getal1 + "+" + getal2+"="+resultaat);
            }
            else //indien min of verkeerde bewerking
            {
                if(this.bewerking.equals("min")) {
                    resultaat = getal1 - getal2;
                    System.out.println(getal1 + "-" + getal2 + "=" + resultaat);
                }
                else
                {
                    resultaat = getal1 / getal2;
                    System.out.println(getal1 + "/" + getal2 + "=" + resultaat);
                }
            }
        }
    }

    public void setGetal1(int getal1) {
        this.getal1 = getal1;
    }

    public void setGetal2(int getal2) {
        this.getal2 = getal2;
    }

    public void setBewerking(String bewerking) {
        this.bewerking = bewerking;
    }
}
