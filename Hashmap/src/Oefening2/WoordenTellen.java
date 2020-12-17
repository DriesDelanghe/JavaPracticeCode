package Oefening2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WoordenTellen {
    private HashMap<String, Integer> woordTel = new HashMap<>();
    String zin;

    public WoordenTellen() {
        this.zin = JOptionPane.showInputDialog("Geef een zin op:");
    }

    public void zinNaarHashmap(){
        String[] woorden = this.zin.split(" ");

        for (int i = 0; i < woorden.length; i++) {
            if(woordTel.containsKey(woorden[i])){
                int aantal = woordTel.get(woorden[i]);
                aantal++;
                woordTel.replace(woorden[i], aantal);
            }else{
                woordTel.put(woorden[i], 1);
            }
        }
    }

    public void showHashMap(){

        zinNaarHashmap();
        String s ="";
        for (String woord: woordTel.keySet()){
            s += woord + " : " + woordTel.get(woord) + "\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }

    public void meestVoorkomendeWoorden(){

        ArrayList<String> MeestVoorkomendeWoorden = new ArrayList<>();
        int grootsteAantal = 0;
        for (String woord: woordTel.keySet()){
            if(woordTel.get(woord) > grootsteAantal){
                grootsteAantal = woordTel.get(woord);
            }
        }

        Iterator it = woordTel.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            if(pair.getValue().equals(grootsteAantal)){
                String woord = pair.getKey().toString();
                MeestVoorkomendeWoorden.add(woord);
                it.remove();
            }
        }

        String s = "Meest voorkomende woorden:\n";
        for (String woord: MeestVoorkomendeWoorden){
            s += woord + "\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }
}
