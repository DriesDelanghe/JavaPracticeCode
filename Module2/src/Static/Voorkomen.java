package Static;

public class Voorkomen {
    private String woord;
    private int aantalKeer;

    public Voorkomen(String woord, int aantalKeer) {
        this.woord = woord;
        this.aantalKeer = aantalKeer;
    }

    @Override
    public String toString() {
        return "Voorkomen{" +
                "naam='" + woord + '\'' +
                ", aantalKeer=" + aantalKeer +
                '}';
    }

    public String getWoord() {
        return woord;
    }

    public void addAantal(){
        this.aantalKeer++;
    }
}
