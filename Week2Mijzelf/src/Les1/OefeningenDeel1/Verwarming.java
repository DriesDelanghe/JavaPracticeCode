package Les1.OefeningenDeel1;

public class Verwarming {

    private double temperatuur;
    private double minTemp;
    private double maxTemp;
    private double ophoogwaarde;

    public Verwarming(double minTemp, double maxTemp, double ophoogwaarde) {
        this.temperatuur = 15;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;

        if(ophoogwaarde > 0){
            this.ophoogwaarde = ophoogwaarde;
        }else{
            System.out.printf("ophoogwaarde kan niet negatief zijn" + "\n");
            this.ophoogwaarde = 0;
        }
    }

    public void Warmer(){
        if(this.temperatuur < this.maxTemp - this.ophoogwaarde){
            this.temperatuur = this.temperatuur + this.ophoogwaarde;
            LeesTemp();
        }else{
            System.out.printf("temperatuur kan niet boven de maximum waarde gezet worden" + "\n"
                    + "Temperatuur wordt op maximum waarde ingesteld" + "\n");
            this.temperatuur = this.maxTemp;
        }

    }
    public void Kouder(){
        if(this.temperatuur > minTemp + ophoogwaarde){
            this.temperatuur = this.temperatuur - this.ophoogwaarde;
            LeesTemp();
        }else {
            System.out.printf("temperatuur kan niet onder de minimum waarde gezet worden" + "\n"
            + "Temperatuur wordt op minimum waarde ingesteld" + "\n");
            this.temperatuur = this.minTemp;
        }

    }

    public void OphoogWaardeWijzigen(double ophoogwaarde){
        if(ophoogwaarde > 0){
            this.ophoogwaarde = ophoogwaarde;
        }else {
            System.out.printf("ophoogwaarde kan niet negatief zijn" + "\n");
        }
    }

    public void LeesTemp() {
        System.out.printf("De temperatuur bedraagt: " + this.temperatuur + "\n");
    }

}
