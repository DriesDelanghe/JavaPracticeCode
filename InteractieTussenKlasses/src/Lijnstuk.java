public class Lijnstuk {

    private Punt beginPunt;
    private Punt eindPunt;

    public Lijnstuk(Punt beginPunt, Punt eindPunt) {
        this.beginPunt = beginPunt;
        this.eindPunt = eindPunt;
    }

    public Punt getEindPunt() {
        return eindPunt;
    }

    public Punt getBeginPunt() {
        return beginPunt;
    }

    public void setBeginPunt(Punt beginPunt) {
        this.beginPunt = beginPunt;
    }

    public void setEindPunt(Punt eindPunt) {
        this.eindPunt = eindPunt;
    }

    @Override
    public String toString() {
        return this.beginPunt + "-" + this.eindPunt;
    }

    public double afstand(){
        double afstand = Math.sqrt(Math.pow(eindPunt.getxCoord() - beginPunt.getxCoord(),2)+
                                    Math.pow(eindPunt.getyCoord()-beginPunt.getyCoord(),2));
        return afstand;
    }
}
