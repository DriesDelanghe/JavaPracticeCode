package WhileLoops;

import javax.swing.*;

public class Oefening3 {
    public static void main(String[] args) {
        int beginWaarde;
        int eindWaarde;
        String input;

        input = JOptionPane.showInputDialog("Geeft beginwaarde");
        beginWaarde = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("geef eindwaarde");
        eindWaarde = Integer.parseInt(input);

        while(eindWaarde - beginWaarde < 50){
            JOptionPane.showMessageDialog(null, "Eindwaarde moet minstens 50 hoger zijn dan " + beginWaarde);
            input = JOptionPane.showInputDialog("geef eindwaarde");
            eindWaarde = Integer.parseInt(input);
        }

        int veelvoud = beginWaarde;
        int index = 1;
        String s = "De veelvouden zijn van " + beginWaarde + " kleiner dan " + eindWaarde + " zijn: \n";

        while(veelvoud < eindWaarde){
                veelvoud = beginWaarde * index;
                s += veelvoud + "\n";
                index++;
        }

        JOptionPane.showMessageDialog(null, s);
    }
}
