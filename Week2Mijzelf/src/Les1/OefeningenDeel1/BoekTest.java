package Les1.OefeningenDeel1;

public class BoekTest {
    public static void main(String[] args) {
        Boek boek1 = new Boek("Het Zomerhuis", "Herman Koch");
        Boek boek2 = new Boek("Basis Wiskunde", "Plantin");

        boek2.IsCursusTekst(true);
        boek1.BoekUitgeleendBoost(100);

        boek1.Print();
        boek2.Print();
    }
}
