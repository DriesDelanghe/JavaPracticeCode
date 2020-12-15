public class Bediende extends Persoon{
    private double salaris;

    public Bediende(String naam, String voornaam, String postcode, double salaris) {
        super(naam, voornaam, postcode);
        this.salaris = salaris;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    @Override
    public String toString() {
        return super.toString() + "Bediende{" + "salaris=" + salaris +
                '}';
    }

    public void verhoogSal(int salarisVerhoging){
        this.salaris += salarisVerhoging;
    }


}
