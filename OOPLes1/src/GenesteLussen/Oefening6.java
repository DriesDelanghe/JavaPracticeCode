package GenesteLussen;

import javax.swing.*;

public class Oefening6 {

    public static void main(String[] args) {
        int getal = 1;

        while(getal > 0){
            int faculteit = 1;
            getal = Integer.parseInt(JOptionPane.showInputDialog("bereken de faculteit van:"));

            for (int i = 1; i < getal+1; i++) {
                faculteit *=i;
            }

            JOptionPane.showMessageDialog(null,"de faculteit van " + getal + " is " + faculteit);
        }


    }
}
