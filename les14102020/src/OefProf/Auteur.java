package OefProf;

import java.util.ArrayList;

public class Auteur {

    private String naam;
    private ArrayList<Boek> lijst = new ArrayList<Boek>();

    public Auteur(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void VoegToe(Boek boek) {
        lijst.add(boek);
    }

    @Override
    public String toString() {
        String s = this.naam + " schreef:" + "\n";
        for(Boek b : lijst){
            s += b.getTitel() + "\n";
        }

        return s;
    }

    public void DrukAf(){
        String s = this.naam + " schreef:" + "\n";
        for(Boek b : lijst){
            s += b.getTitel() + "\n";
        }

        System.out.println(s);
    }

    public void VerhoogPrijs10Procent(){
        for(Boek b : lijst){
            double prijs = b.getPrijs() *1.1;
            b.setPrijs(prijs);

        }
    }
}
