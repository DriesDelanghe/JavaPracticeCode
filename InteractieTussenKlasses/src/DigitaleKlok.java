public class DigitaleKlok {

    private Teller uur;
    private Teller minuut;
    private Teller second;

    public DigitaleKlok(Teller uur, Teller minuut, Teller second) {
        this.uur = uur;
        this.minuut = minuut;
        this.second = second;
    }

    public Teller getUur() {
        return uur;
    }

    public Teller getMinuut() {
        return minuut;
    }

    public Teller getSecond() {
        return second;
    }

    public void setUur(Teller uur) {
        this.uur = uur;
    }

    public void setMinuut(Teller minuut) {
        this.minuut = minuut;
    }

    public void setSecond(Teller second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return this.uur + ":" + this.minuut + ":" + this.second;
    }

    public void verhoogUur(){
        int teller = this.uur.getTeller();
        teller ++;

        if(teller < 24){
            this.uur.setTeller(teller);
        }else{
            this.uur.setTeller(0);
        }
    }

    public void verhoogMinuut(){
        int teller = this.minuut.getTeller();
        teller ++;

        if(teller < 60){
            this.minuut.setTeller(teller);
        }else{
            this.minuut.setTeller(0);
            verhoogUur();
        }
    }

    public void verhoogSecond(){
        int teller = this.second.getTeller();
        teller ++;

        if(teller < 60){
            this.second.setTeller(teller);
        }else{
            this.second.setTeller(0);
            verhoogMinuut();
        }
    }

}
