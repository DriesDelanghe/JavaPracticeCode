public class Deelbaar {

    public Deelbaar() {
    }

    public void deelbaar(int getal, int deler){
        int rest = getal%deler;
        if (rest == 0){
            int deling = getal/deler;
            System.out.println(getal + "/" + deler + "=" + deling);
        } else{
            System.out.println("getal is niet deelbaar door deler");
        }
    }

    public void controleer(int getal, int cijfer){
        int laatsteCijfer = getal % 10;
        if(laatsteCijfer == cijfer){
            System.out.println("getal: " + getal + ", cijfer: " + cijfer + ", OK");
        }else {
            System.out.println("getal: " + getal + ", cijfer: " + cijfer + ", Niet OK");
        }
    }

    public void kleinste(int getal1, int getal2, int getal3){
        int kleinste = getal1;
        if(kleinste > getal2){
            kleinste = getal2;
        }if(kleinste > getal3){
            kleinste = getal3;
        }

        System.out.println("kleinste getal: " + kleinste);
    }
}
