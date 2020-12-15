package Les1.OefeningenDeel1;

public class ProductTest {
    public static void main(String[] args) {
        Product ijsje = new Product(5.99);
        ijsje.DrukAf();
        ijsje.VerhoogN(0.33);
        ijsje.DrukAf();
        ijsje.Verhoog1();
        ijsje.DrukAf();
        ijsje.Verdubbel();
        ijsje.DrukAf();
        ijsje.Halveer();
        ijsje.DrukAf();
        ijsje.PercentMeer();
        ijsje.DrukAf();
        ijsje.PercentMinder();
        ijsje.DrukAf();
    }
}
