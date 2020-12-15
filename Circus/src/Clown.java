import java.util.Arrays;

public class Clown {

    private String naam;
    private double Vergoeding;
    private boolean[] werkt = new boolean[7];
    private double[] Schaterindices = new double[365];


    public Clown(String naam, double vergoeding) {
        this.naam = naam;
        Vergoeding = vergoeding;
        for (int i = 0; i < werkt.length; i++) {
            werkt[i] = true;
        }
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getVergoeding() {
        return Vergoeding;
    }

    public void setVergoeding(double vergoeding) {
        Vergoeding = vergoeding;
    }

    public boolean getWerkt(int position) {
        return werkt[position];
    }

    public void setWerkt(boolean werkt, int dag) {
        this.werkt[dag] = werkt;
    }

    public double[] getSchaterindices() {
        return Schaterindices;
    }

    public void setSchaterindices(double decibel, int position) {
        Schaterindices[position] = decibel;
    }


    @Override
    public String toString() {
        return "Clown{" +
                "naam='" + naam + '\'' +
                ", Vergoeding=" + Vergoeding +
                ", werkt=" + Arrays.toString(werkt) + "\n" +
                ", Schaterindices=" + Arrays.toString(Schaterindices) +
                '}';
    }

    public double berekenJaarloon(){
        int jaarloon = 0;

        for (int i = 0; i < Schaterindices.length; i++) {
            if(Schaterindices[i] != 0){
                jaarloon += this.Vergoeding;
            }
        }

        return jaarloon;
    }

    public double lachtoeslag(){
        int toeslag;
        int gemiddelde = 0;
        int aantal = 0;

        for (int i = 0; i < Schaterindices.length; i++) {
            if(Schaterindices[i] != 0){
                gemiddelde += Schaterindices[i];
                aantal++;
            }
        }

        gemiddelde = gemiddelde/aantal;
        toeslag = gemiddelde*10;

        return toeslag;
    }

    public int hardsteGelachen(){

        int dag = 0;
        double[] SomDecibel = new double[7];

        double Grootste = 0;
        int PositionGrootste = 0;

        for (int i = 0; i < Schaterindices.length; i++) {
            if (getWerkt(dag) != false) {
                SomDecibel[dag] += Schaterindices[i];
            }
            if (dag < 6) {
                dag++;
            } else {
                dag = 0;
            }
        }

        for (int i = 0; i < SomDecibel.length; i++) {
            if(SomDecibel[i] > Grootste){
                Grootste = SomDecibel[i];
                PositionGrootste = i;
            }
        }
        return PositionGrootste;
    }

    public double jaarbonus(){
        double jaarbonus = 0;
        int aantalDagen = 0;

        for (int i = 0; i < Schaterindices.length; i++) {
            if(Schaterindices[i] != 0){
                aantalDagen++;
            }
        }
        if(aantalDagen <= 100){
            jaarbonus = 0;
        }else if(aantalDagen <= 150){
            jaarbonus = ((aantalDagen-100) *0.1) * Vergoeding;
        }else if(aantalDagen <= 200){
            jaarbonus = (50*0.1)*Vergoeding + ((aantalDagen-150)*0.15)*Vergoeding;
        }else{
            jaarbonus = (50*0.1)*Vergoeding + (50*0.15)*Vergoeding + ((aantalDagen-200)*0.2)*Vergoeding;
        }

        return jaarbonus;
    }
}
