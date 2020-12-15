package Les1.OefeningenDeel1;

public class Bankrekening {

    private String rekeningnummer;
    private double saldo;

    public Bankrekening(String rekeningnummer, double saldo) {
        this.rekeningnummer = rekeningnummer;
        this.saldo = saldo;
    }

    public void neemOp(double afhaalBedrag){
        if(afhaalBedrag > 0) {
            this.saldo -= afhaalBedrag;
        }else{
            System.out.println("afhaalbedrag kan niet 0 of negatief zijn" + "\n");
        }
    }

    public void Stort(double stortBedrag){
        if(stortBedrag > 0){
            this.saldo += stortBedrag;
        }else {
            System.out.println("stort bedrag kan niet 0 of negataief zijn" + "\n");
        }
    }

    public void GetSaldo(){
        System.out.println( this.saldo + "\n");
    }

    public void print(){
        System.out.println("rekeningnummer: " + rekeningnummer + "\n"
        + "saldo: " + saldo);
    }
}
