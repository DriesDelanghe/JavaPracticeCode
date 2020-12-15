package Week1.Les2;

public class Product {

    private String description;
    private double price;

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    //void for no return
    //after every function (), even when there are no parameters
    public void DrukAf(){
        System.out.println(this.description + " kost " + this.price + " euro.");

    }


   // @Override
  //  public String toString() {
  //      return description + " kost " + price + " euro";
  //  }



}
