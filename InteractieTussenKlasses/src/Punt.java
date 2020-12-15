public class Punt {

    private double xCoord;
    private double yCoord;

    public Punt(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public double getxCoord() {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public String toString() {
        return "(x=" + xCoord + ", y=" + yCoord + ")";
    }
}
