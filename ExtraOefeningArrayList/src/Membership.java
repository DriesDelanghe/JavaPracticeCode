public class Membership {

    private int nummer;
    private String naam;
    private boolean inwoner = false;

    public Membership(int nummer, String naam, boolean inwoner) {
        this.naam = naam;
        this.inwoner = inwoner;

        if(inwoner){
            if(10000 < nummer && nummer < 20000){
                this.nummer = nummer;
            }
        }else {
            if(20000 < nummer && nummer < 30000){
                this.nummer = nummer;
            }
        }
    }

    public int getNummer() {
        return nummer;
    }

    public String getNaam() {
        return naam;
    }

    public boolean isInwoner() {
        return inwoner;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setInwoner(boolean inwoner) {
        this.inwoner = inwoner;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "nummer=" + nummer +
                ", naam='" + naam + '\'' +
                ", inwoner=" + inwoner +
                '}';
    }
}
