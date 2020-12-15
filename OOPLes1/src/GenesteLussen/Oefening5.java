package GenesteLussen;

import javax.swing.*;

public class Oefening5 {
    public static void main(String[] args) {
        double aantalGetallen;
        double som = 0;
        double gemiddelde;

        String input ="";
        String inputAantal="";


        inputAantal = JOptionPane.showInputDialog("Hoeveel getallen?");

        while(input != "STOP" && Integer.parseInt(inputAantal) > 0 && inputAantal != "STOP"){
            aantalGetallen = Integer.parseInt(inputAantal);

            for (int i = 0; i < aantalGetallen; i++) {
                    input = JOptionPane.showInputDialog("Voer getal " + (i+1) + " in");
                    som += Double.parseDouble(input);
            }
            gemiddelde = som/aantalGetallen;

            JOptionPane.showMessageDialog(null, "het gemiddelde is: " + gemiddelde);

            inputAantal = JOptionPane.showInputDialog("Hoeveel getallen?");
        }

    }
}
