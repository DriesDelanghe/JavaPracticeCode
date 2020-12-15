import java.util.ArrayList;

public class OverzichtPersonen {

    ArrayList<Persoon> PersonenEnBediende = new ArrayList<>();

    public OverzichtPersonen() {
    }

    public void AddToArray(Persoon persoon){
        PersonenEnBediende.add(persoon);
    }

    @Override
    public String toString() {
        String s = "OverzichtPersonen{";

        for (int i = 0; i < PersonenEnBediende.size(); i++) {
            s+= PersonenEnBediende.get(i);
        }

        return s;
    }
}
