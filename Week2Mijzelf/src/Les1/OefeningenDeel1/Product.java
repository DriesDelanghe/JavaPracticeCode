package Les1.OefeningenDeel1;

public class Product {
    private double prijs;

    public Product(double prijs) {
        this.prijs = prijs;
    }

    public void DrukAf(){
        System.out.println("prijs: " + prijs);
    }

    public void VerhoogN(double prijsVerhoging){
        this.prijs = this.prijs + prijsVerhoging;
    }

    public void Verhoog1(){
        this.prijs = prijs++;
    }

    public void Verdubbel(){
        this.prijs = this.prijs*2;
    }

    public void Halveer(){
        this.prijs = this.prijs/2;
    }

    public void PercentMeer(){
        this.prijs = this.prijs + this.prijs/10;
    }

    public void PercentMinder(){
        this.prijs = this.prijs - (this.prijs*20)/100;
        }
}
