package WhileLoops;

import javax.swing.*;

public class Oefening4Simple {
    public static void main(String[] args) {
        int getal;
        String input;
        int deler = 2;

        input = JOptionPane.showInputDialog("Is dit een priemgetal?");
        getal = Integer.parseInt(input);

        while (deler < getal && getal % deler != 0) {
            deler++;
        }


        if (deler == getal) {
            JOptionPane.showMessageDialog(null, getal + " is een priemgetal.");
        } else {
            JOptionPane.showMessageDialog(null, getal + " is geen priemgetal");
        }

    }
}

