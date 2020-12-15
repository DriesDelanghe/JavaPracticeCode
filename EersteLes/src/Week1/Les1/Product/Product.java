package Week1.Les1.Product;

public class Product {

    private String omschrijving;
    private int aantal;

    public Product(String Omschrijving, int Aantal){
        this.aantal = Aantal;
        this.omschrijving = Omschrijving;
    }

    public void Druk(){
        System.out.println(aantal + " " + omschrijving);
    }
}
