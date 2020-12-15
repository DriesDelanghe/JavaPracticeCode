public class Mens {
    private String naam;
    private int leeftijd;

    public Mens() {

    }

    public Mens(String naam, int leeftijd) {
        this.naam = naam;
        if(leeftijd >= 0){
            this.leeftijd = leeftijd;
        }else {
            this.leeftijd = 0;
            System.out.println("leeftijd kan niet negatief zijn, wordt gezet op 0");
        }

    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLeeftijd(int leeftijd) {
        if(leeftijd >= 0){
            this.leeftijd = leeftijd;
        }else {
            this.leeftijd = 0;
            System.out.println("leeftijd kan niet negatief zijn, wordt gezet op 0");
        }
    }

    public void spreek(){
        System.out.println(
                "Dag, mijn naam is " + naam + " en ik ben " + leeftijd + " jaar."
        );
    }

    public String code(){
        return naam.charAt(0) + String.valueOf(leeftijd);
    }

    public String bepaalFase(){

        String fase;
        if(leeftijd < 12){
            fase = "kind";
        }else if(leeftijd < 18){
            fase = "minderjarige";
        }else if(leeftijd <= 66){
            fase = "meerderjarige";
        }else{
            fase = "gepensioneerde";
        }

        return fase;
    }
}
