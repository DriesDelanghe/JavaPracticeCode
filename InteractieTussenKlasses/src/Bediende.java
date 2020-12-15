public class Bediende {

    private String naam;
    private double salaris;
    private Afdeling afdeling;

    public Bediende(String naam, double salaris) {
        this.naam = naam;
        this.salaris = salaris;
    }

    public String getNaam() {
        return naam;
    }

    public double getSalaris() {
        return salaris;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public void verhoogSalaris(double verhoging){
        if(verhoging <= this.salaris/10){
            this.salaris += verhoging;
        }else{
            this.salaris += this.salaris/10;
            System.out.println("Verhoging mag niet meer dan 10% van de huidige salaris zijn" + "\n" +
                    "Salaris wordt verhoogt met 10%");
        }
    }

    @Override
    public String toString() {
        return this.naam + " verdient " + this.salaris + " en is werkzaam in " + this.afdeling.getNaam() +
                " op de locatie " + this.afdeling.getLocatie();
    }
}
