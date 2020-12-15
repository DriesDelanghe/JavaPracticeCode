package oefeningenbundel1;

public class Bankrekening {
    private String reknr;
    private double saldo;

    public Bankrekening(String reknr, double saldo) {
        this.reknr = reknr;
        this.saldo = saldo;
    }

    //wat heeft deze functie van u nodig qua info,
    // u = main-functie in de Test-klasse
    //wat kent elke functie? Kent zijn private variabelen
    public void haalAf(double bedrag)
    {
        if (this.saldo - bedrag >= 0 ) {
            this.saldo = this.saldo - bedrag;
        }
        else
        {
            System.out.println("niet genoeg geld op de rek");
        }
    }
    public void stort(double bedrag)
    {
        this.saldo = this.saldo + bedrag;
    }
    @Override
    public String toString() {
        return "Bankrekening{" +
                "reknr='" + reknr + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getReknr() {
        return reknr;
    }

    public void setReknr(String reknr) {
        this.reknr = reknr;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
