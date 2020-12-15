package oefeningenbundel1;

public class Verwarming {
    private double temp;
    private double minTemp;
    private double maxTemp;
    private double ophoogwaarde;

    public Verwarming(double minTemp, double maxTemp, double ophoogwaarde) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.ophoogwaarde = ophoogwaarde;
        this.temp = 15;
    }
    public void warmer()
    {
        if(this.temp + this.ophoogwaarde <= this.maxTemp) {
            this.temp = this.temp + this.ophoogwaarde;
        }
        else
        {
            System.out.println("max bereikt");
        }
    }
    public void kouder()
    {
        if(this.temp - this.ophoogwaarde >= this.minTemp) {
            this.temp = this.temp + this.ophoogwaarde;
        }
        else
        {
            System.out.println("min bereikt");
        }
    }

    @Override
    public String toString() {
        return "Verwarming{" +
                "temp=" + temp +
                ", minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                ", ophoogwaarde=" + ophoogwaarde +
                '}';
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setOphoogwaarde(double ophoogwaarde) {
        if (ophoogwaarde > 0) {
            this.ophoogwaarde = ophoogwaarde;
        }
        else
        {
            System.out.println("ophoogwaarde moet positief zijn");
        }
    }
}
