package Les1.OefeningenDeel2;

public class BankrekeningTest {
    public static void main(String[] args) {
        Bankrekening rekening1 = new Bankrekening("1245653245", 350, 250);

        rekening1.neemOp(99);
        rekening1.GetSaldo();
        rekening1.print();
    }
}
