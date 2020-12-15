package Les1.OefeningenDeel1;

public class BankrekeningTest {

    public static void main(String[] args) {
        Bankrekening joris = new Bankrekening("051263345", 15000);
        Bankrekening jef = new Bankrekening("039743265", 250000);
/*
        joris.GetSaldo();
        jef.GetSaldo();


        joris.neemOp(-20);
        joris.neemOp(20);
        joris.GetSaldo();
 */
        jef.Stort(200);
        jef.Stort(-200);
        jef.print();
    }
}
