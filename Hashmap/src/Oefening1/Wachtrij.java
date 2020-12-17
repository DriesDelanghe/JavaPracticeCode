package Oefening1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

enum Status {
    WACHTEND,
    BEDIEND
}

public class Wachtrij {
    private HashMap<String, Status> wachtrij = new HashMap<>();

    public Wachtrij() {
    }

    public void voegToeWachtrij(String naam) {
        wachtrij.put(naam, Status.WACHTEND);
    }

    public void wordtBediend(String naam) {
        wachtrij.replace(naam, Status.BEDIEND);
    }

    public void statusWachtrij() {
        ArrayList<String> Bediend = new ArrayList<>();
        ArrayList<String> Wachtend = new ArrayList<>();
        for (String naam : wachtrij.keySet()) {
            if (wachtrij.get(naam) == Status.WACHTEND) {
                Wachtend.add(naam);
            } else {
                Bediend.add(naam);
            }
        }

        String s = "Wachtend: \n";
        s += printArray(Wachtend) + "\n";
        System.out.println(s);
        s = "Bediend: \n";
        s += printArray(Bediend) + "\n";
        System.out.println(s);
    }

    private String printArray(ArrayList<String> arraylist) {
        String s = "";
        for (String item : arraylist) {
            s += item + "\n";
        }

        return s;
    }

    public void verwijderBediend() {
        Iterator it = wachtrij.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getValue().equals(Status.BEDIEND)) {
                it.remove();
            }
        }
    }
}
