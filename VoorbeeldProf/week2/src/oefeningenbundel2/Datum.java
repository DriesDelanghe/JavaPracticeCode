package oefeningenbundel2;

public class Datum {
    private int dag = 1;
    private int maand = 1;
    private int jaar = 1900;

    public Datum() {

    }

    public Datum(int dag, int maand, int jaar) {
        if (dag >= 1 && dag <= 31)//&& = and = beide voorwaarden moeten waar zijn
        {
            this.dag = dag;
        } else {
            System.out.println("verkeerde dag");
        }
        if (maand >= 1 && maand <= 12) {
            this.maand = maand;
        } else {
            System.out.println("geen juiste maand");
        }
        if (jaar >= 1900 && jaar <= 3000) {
            this.jaar = jaar;
        } else {
            System.out.println("geen juist jaar");
        }
    }

    //uitleggen hoe je dit overschrijft met een eigen string
    @Override
    public String toString() {
        return "Datum{" +
                "dag=" + dag +
                ", maand=" + maand +
                ", jaar=" + jaar +
                '}';
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public void setMaand(int maand) {
        this.maand = maand;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }
}
