public class Datum {

    private int dag;
    private int maand;
    private int jaar;


    //constructors

    public Datum(int dag, int maand, int jaar) {

        if(1 <= dag && dag <= 31) {
            this.dag = dag;
        } else{
            System.out.println("dag buiten juiste waarden");
        }
        if(1 <= maand && maand <= 12){
            this.maand = maand;
        } else{
        System.out.println("maand buiten juiste waarden");
    }

        if(1900 <= jaar && jaar <= 3000){
            this.jaar = jaar;
        } else{
        System.out.println("jaar buiten juiste waarden");
        }
    }

    public Datum() {
        this.dag = 1;
        this.maand = 1;
        this.jaar = 2000;
    }
    //Getters

    public int getDag() {
        return dag;
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
    }


    //Setters

    public void setDag(int dag) {
        this.dag = dag;
    }

    public void setMaand(int maand) {
        this.maand = maand;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }


    //toString

    @Override
    public String toString() {
        return  dag + "-" + maand + "-" + jaar;
    }
}
