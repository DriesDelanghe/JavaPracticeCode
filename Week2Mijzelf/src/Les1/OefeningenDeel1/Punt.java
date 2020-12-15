package Les1.OefeningenDeel1;

public class Punt {
    private double xcoord;
    private double ycoord;

    public Punt(double xcoord, double ycoord) {
        this.xcoord = xcoord;
        this.ycoord = ycoord;
    }

    public void DrukAf(){
        System.out.println("coördinaten = (" + xcoord +"," + ycoord + ")");
    }
}
