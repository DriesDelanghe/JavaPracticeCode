package oplossingKlokProf;

public class Teller {

    private int getal;
    private int maximum;

    public Teller(int getal, int maximum) {
        this.getal = getal;
        this.maximum = maximum;
    }

    public int getGetal() {
        return getal;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setGetal(int getal) {
        this.getal = getal;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int verhoog(){
        getal++;
        if( getal > maximum){
            getal = 0;
        }
        return getal;
    }

    @Override
    public String toString() {
        return Integer.toString(getal);
    }
}
