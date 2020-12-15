package Week1.Les2;

public class ProductTest {

    public static void main(String[] args) {
        Product Choco = new Product("nutella", 3.5);
        Product Smeerkaas = new Product("La vache", 3);

        //object.DoeIets()
        Choco.DrukAf();
        Smeerkaas.DrukAf();
    }

}
