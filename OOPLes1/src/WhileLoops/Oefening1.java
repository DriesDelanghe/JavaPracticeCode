package WhileLoops;

import javax.swing.*;
        import java.util.ArrayList;

public class Oefening1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Geef een getal in");
        int product = 1;

        while (!input.equals("STOP")) {
            int getal = Integer.parseInt(input);
            if (getal == 0) {
                JOptionPane.showMessageDialog(null, "getal mag niet 0 zijn");
            } else {
                product *= getal;
            }

            input = JOptionPane.showInputDialog("Geef een getal in");
        }


        JOptionPane.showMessageDialog(null, "product: " + product);
    }
}