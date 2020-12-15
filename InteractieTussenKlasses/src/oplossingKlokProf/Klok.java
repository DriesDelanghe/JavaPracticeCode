package oplossingKlokProf;

public class Klok {

    private Teller uur;
    private Teller minuut;
    private Teller seconden;

    public Klok(int u, int m, int s){
        this.uur = new Teller(u, 23);
        this.minuut = new Teller(m, 59);
        this.seconden = new Teller (s, 59);
    }

    public void verhoogUur(){
        this.uur.verhoog();
    }

    public void verhoogMinuut(){
       int getal = this.minuut.verhoog();
        if(getal == 0){
            verhoogUur();
       }
    }

    public void verhoogSeconde(){
        int getal = this.seconden.verhoog();
        if(getal == 0){
            verhoogMinuut();
        }
    }

    @Override
    public String toString() {
        return  uur + ":"  + minuut + ":" + seconden;
    }
}
