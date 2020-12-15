public class Product {

    private String naamProduct;
    private double prijs;
    private double BTWPercentage;
    private double hoeveelheidskorting;
    final private double VASTE_VERZENDINGSKOSTEN = 3.5;

    public Product(String naamProduct, double prijs, double BTWPercentage, double hoeveelheidskorting) {
        this.naamProduct = naamProduct;

        if(0 < prijs){
            this.prijs = prijs;
        }else{
            System.out.println("prijs kan niet negatief zijn");
        }
        this.BTWPercentage = BTWPercentage;
        this.hoeveelheidskorting = hoeveelheidskorting;
    }

    public Product(String naamProduct) {
        this.naamProduct = naamProduct;
        this.prijs = 0;
        this.BTWPercentage = 0.06;
    }

    public void kassaticket(int aantal, boolean verzendkosten){
        this.prijs *= aantal;

        if(verzendkosten){
            this.prijs += VASTE_VERZENDINGSKOSTEN;
        }

        System.out.println("De prijs is: " + this.prijs);
    }

    public void kassaticket(boolean verzendkosten){
        if(verzendkosten){
            this.prijs += VASTE_VERZENDINGSKOSTEN;
        }

        System.out.println("De prijs is: " + this.prijs);
    }

    public void prijsSolden(double kortingspercentage){

        if(this.prijs > 0) {
            if(this.prijs <= 10){
                this.prijs -= this.prijs*0.5;
                System.out.println("prijs is lager dan 10 euro, 50% korting toegediend");
            }else {
                this.prijs -= this.prijs * kortingspercentage;
                System.out.println("korting doorgevoerd");
            }
        }else{
            System.out.println("prijs is 0");
        }
    }

    public void prijsVerhoging(double verhoging){
        this.prijs += verhoging;
        System.out.println("prijs is verhoogd met " + verhoging + "\n" + "nieuwe prijs: " + this.prijs);
    }

    public void prijsVerhoging(){
        this.prijs += this.prijs*0.01;

        System.out.println("prijs is verhoogt met 1%" + "\n" + "nieuwe prijs: " + this.prijs);
    }

    public void teBetalen(int aantalGekochteProducten){
        prijs = this.prijs;
        if(aantalGekochteProducten < 10){
            this.prijs*=aantalGekochteProducten;
        }else if (aantalGekochteProducten < 20){
            prijs = this.prijs * 9 + this.prijs * (aantalGekochteProducten-9)*(1-hoeveelheidskorting);
        }else {
            prijs = this.prijs * 9 + this.prijs * (10)*(1-hoeveelheidskorting) +
            this.prijs *(aantalGekochteProducten-19)*(2*(1-hoeveelheidskorting));
        }
        this.prijs = prijs;
    }

    public void ToonBTW(){
        double totaalBTW = this.prijs*BTWPercentage;
        double totaalPrijsInclBTW = this.prijs + totaalBTW;
        double totaalPrijsExlBTW = this.prijs;

        System.out.println(
                "totaal btw: " + totaalBTW + "\n" +
                "totaal prijs inclusief btw: " + totaalPrijsInclBTW + "\n" +
                "totaal prijs exlusief btw: " +totaalPrijsExlBTW + "\n"
        );
    }
}
