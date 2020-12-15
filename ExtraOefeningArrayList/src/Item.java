public class Item {

    private int type;
    private String titel;
    private double bijdrage;

    public final int BOEK = 0;
    public final int PARTITUUR = 1;
    public final int ALBUM = 2;
    public final int KRANT_TIJDSCHRIFT = 3;

    public Item(int type, String titel) {
        if(0<= type && type <= 3){
            this.type = type;
        }else{
            this.type = 0;
        }
        this.titel = titel;
        this.bijdrage = 0;
    }

    public Item(int type, String titel, double bijdrage) {
        if(0<= type && type <= 3){
            this.type = type;
        }else{
            this.type = 0;
        }
        this.titel = titel;

        if(0 <= bijdrage && bijdrage <= 13.5) {
            this.bijdrage = bijdrage;
        }
    }

    public int getType() {
        return type;
    }

    public String getTitel() {
        return titel;
    }

    public double getBijdrage() {
        return bijdrage;
    }

    public void setType(int type) {
        if(0<= type && type <= 3){
            this.type = type;
        }else{
            this.type = 0;
        }
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBijdrage(double bijdrage) {
        if(0 <= bijdrage && bijdrage <= 13.5) {
            this.bijdrage = bijdrage;
        }
    }

    public String GetTypeAsText(int type){
        String s = "";

        if(this.type == BOEK){
            s = "BOEK";
        }else if(this.type == PARTITUUR){
            s = "PARTITUUR";
        }else if(this.type == ALBUM){
            s = "ALBUM";
        }else if(this.type == KRANT_TIJDSCHRIFT){
            s="KRANT/TIJDSCHRIFT";
        }

        return s;
    }

    @Override
    public String toString() {
        return GetTypeAsText(this.type) + "(titel = " + this.titel + ", bijdrage = " + this.bijdrage + ") \n";
    }
}
