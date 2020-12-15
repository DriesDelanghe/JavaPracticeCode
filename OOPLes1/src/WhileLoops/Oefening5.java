package WhileLoops;

import javax.swing.*;

public class Oefening5 {

    public static void main(String[] args) {
        int kleinsteGetal;
        int grootsteGetal;
        int kleinste;
        int rest;

        kleinsteGetal = Integer.parseInt(JOptionPane.showInputDialog("Geef het kleinste getal op"));
        grootsteGetal = Integer.parseInt(JOptionPane.showInputDialog("Geef het grootste getal op"));

        while (grootsteGetal <= kleinsteGetal) {
            JOptionPane.showMessageDialog(null, "Grootste getal moet groter zijn dan kleinste");
            grootsteGetal = Integer.parseInt(JOptionPane.showInputDialog("Geef het grootste getal op"));
        }

        rest = grootsteGetal % kleinsteGetal;
        kleinste = kleinsteGetal;
        int GGD = kleinsteGetal;

        while (rest > 0) {
            GGD = rest;
            rest = kleinste % rest;
            if (rest != 0) {
                kleinste = rest;
            }
        }

        JOptionPane.showMessageDialog(null, "De GGD van " + kleinsteGetal + " en " + grootsteGetal
                + " is " + GGD
        );

    }
}
