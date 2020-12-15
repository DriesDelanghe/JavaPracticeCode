package Week1.Les1.Bloem;

public class Bloem {

    private String Name;
    private String Colour;
    private int Price;
    public Bloem (String FlowerName, String FlowerColour, int FlowerPrice){
        this.Name = FlowerName;
        this.Colour = FlowerColour;
        this.Price = FlowerPrice;
    }

    public void Toon() {
        System.out.println("Een " + Name + " kost " + Price + " euro.");
    }
}
