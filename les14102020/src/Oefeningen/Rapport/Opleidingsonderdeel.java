package Oefeningen.Rapport;

public class Opleidingsonderdeel {

    private double punten;
    private String vak;

    public Opleidingsonderdeel(double punten, String vak) {
        this.punten = punten;
        this.vak = vak;
    }

    public double getPunten() {
        return punten;
    }

    public String getVak() {
        return vak;
    }
}
