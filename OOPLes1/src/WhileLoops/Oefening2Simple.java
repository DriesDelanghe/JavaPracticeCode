package WhileLoops;

import javax.swing.*;
import java.util.ArrayList;

public class Oefening2Simple {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Geef een getal in");
        ArrayList<String> getallen = new ArrayList<>();
        int getal = Integer.parseInt(input);

        int voorlopigGrootste = getal;

        while (!input.equals("STOP")) {
            getal = Integer.parseInt(input);
            if (getal == 0) {
                JOptionPane.showMessageDialog(null, "getal mag niet 0 zijn");
            } else {
                if(getal > voorlopigGrootste){
                    voorlopigGrootste = getal;
                }
            }

            input = JOptionPane.showInputDialog("Geef een getal in");
        }


        JOptionPane.showMessageDialog(null, "grootste getal: " + voorlopigGrootste);
    }
}
