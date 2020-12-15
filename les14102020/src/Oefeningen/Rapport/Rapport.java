package Oefeningen.Rapport;

import java.util.ArrayList;

public class Rapport {

    private Student student;
    private ArrayList<Opleidingsonderdeel> vakken = new ArrayList<Opleidingsonderdeel>();

    public Rapport(Student student) {
        this.student = student;
    }

    public void voegtoe(Opleidingsonderdeel vak){
        vakken.add(vak);
    }

    @Override
    public String toString() {
        String s = "Dit is het rapport van " + student.getNaam() + ", deze is van de basisklas " + student.getKlas() + "\n";
        for(Opleidingsonderdeel v: vakken){
            s += "Behaalde voor " + v.getVak() + ": " + v.getPunten() + "\n";
        }
        s += Gemiddelde();
        return s;
    }

    public String Gemiddelde(){
        double gemiddelde = 0;
        for(Opleidingsonderdeel v : vakken){
            gemiddelde += v.getPunten();
        }

        gemiddelde /= vakken.size();

        return "Het gemiddelde van de vakken is " + gemiddelde;
    }
}
