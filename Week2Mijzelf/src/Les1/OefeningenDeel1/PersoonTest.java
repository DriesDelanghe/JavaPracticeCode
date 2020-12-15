package Les1.OefeningenDeel1;

public class PersoonTest {
    public static void main(String[] args) {
        Persoon peter = new Persoon("Janssens", "Peter", "Brussel", 1600);
        Persoon jan = new Persoon("Peeters", "Jan", "Antwerpen",2200);

        peter.DrukAf();
        jan.DrukAf();

        peter.Verhuis("Gent");
        peter.VasteOpslag();
        peter.OpslagBedrag(200);
        peter.OpslagPercent(10);
        peter.OpslagPlusBonus(250,400);
    }
}
