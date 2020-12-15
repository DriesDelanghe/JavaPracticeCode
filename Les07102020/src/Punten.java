public class Punten {
    private int getal;

    public Punten(int getal) {
        if(getal >= 0){
            this.getal = getal;
        }else{
            System.out.println("negatieve waarde ingegeven");
        }

    }

    public void druk(){
        if(getal >= 18){
            System.out.println("grootste onderscheiding");
        }else if(getal >= 16) {
            System.out.println("grote onderscheiding");
        }else if(getal >= 14){
            System.out.println("onderscheiding");
        }else if(getal >= 10){
            System.out.println("voldoening");
        }else if(getal >= 0) {
            System.out.println("onvoldoende");
        }else {
            System.out.println("negatieve waarde ingegeven");
        }
    }
}
