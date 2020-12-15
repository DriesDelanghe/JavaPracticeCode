package Les1.OefeningenDeel2;

public class Bankrekening {

    private String rekeningnummer;
    private double saldo;
    private double saldoMinimum;

    public Bankrekening(String rekeningnummer, double saldo, double saldoMinimum) {

        //juistheid rekeningnummer
        
        this.rekeningnummer = rekeningnummer;


        this.saldo = saldo;
        this.saldoMinimum = saldoMinimum;
    }

    public void neemOp(double afhaalBedrag){
        if(this.saldo - afhaalBedrag > saldoMinimum) {
            if (afhaalBedrag > 0) {
                this.saldo -= afhaalBedrag;
            } else {
                System.out.println("afhaalbedrag kan niet 0 of negatief zijn" + "\n");
            }
        }else{
            System.out.println("Saldo kan niet uitkomen onder de minimumwaarde");
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
                + "saldo: " + saldo + "\n" + "rekeningminimum: " + saldoMinimum + "\n");
    }

    public void isSaldoPositief(){
        if(this.saldo > 0){
            System.out.println("saldo is positief" + "\n" + "saldo: " + this.saldo + "\n");
        }else{
            System.out.println("saldo is negatief!" + "\n" + "saldo: " + this.saldo + "\n");
        }
    }
}
