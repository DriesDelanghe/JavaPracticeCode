public class Teller {

    private int teller;
    private String tijd;

    public Teller(int teller, String tijd) {
        this.tijd = tijd;
        if(tijd == "uur"){
            if(teller < 24){
                this.teller = teller;
            }else{
                System.out.println("uur kan niet voorbij 24 ingesteld worden");
            }
        }else if(tijd =="minuut" || tijd =="second"){
            if(teller < 60){
                this.teller = teller;
            }else{
                System.out.println("minuut of second kan niet voorbij 60 ingesteld worden");
            }
        }else{
            System.out.println("Geef geldige waarde voor tijd");
        }

    }

    public int getTeller() {
        return teller;
    }

    public String getTijd() {
        return tijd;
    }

    public void setTeller(int teller) {
        if(tijd == "uur"){
            if(this.teller < 24){
                this.teller = teller;
            }else{
                this.teller = 0;
            }
        }
        if(tijd =="second" || tijd == "minuut"){
            if(this.teller < 60){
                this.teller = teller;
            }else {
                this.teller = 0;
            }
        }
    }


    @Override
    public String toString() {
        return Integer.toString(teller);
    }
}
