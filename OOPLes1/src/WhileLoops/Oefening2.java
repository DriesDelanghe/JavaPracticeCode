package WhileLoops;

import javax.swing.*;
import java.util.ArrayList;

public class Oefening2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Geef een getal in");
        int product = 1;
        ArrayList<String> getallen = new ArrayList<>();
        int index = 0;

        while (!input.equals("STOP")) {
            int getal = Integer.parseInt(input);
            if (getal == 0) {
                JOptionPane.showMessageDialog(null, "getal mag niet 0 zijn");
            } else {
                getallen.add(Integer.toString(getal));
            }

            input = JOptionPane.showInputDialog("Geef een getal in");
        }
        int grootsteGetal = Integer.parseInt(getallen.get(0)) ;

        for (int i = 0; i < getallen.size(); i++) {
            int getal = Integer.parseInt(getallen.get(i));
            if(getal > grootsteGetal){
                grootsteGetal = getal;
            }
        }

        JOptionPane.showMessageDialog(null, "grootste getal: " + grootsteGetal);
    }
}

