package WhileLoops;

import javax.swing.*;

public class Oefening6 {

    public static void main(String[] args) {
        String input;
        int n = 0;
        int som = 0;

        input = JOptionPane.showInputDialog("geef een getal op");

        while(n < input.length()){
            som += Character.getNumericValue(input.charAt(n));
            n++;
        }

        JOptionPane.showMessageDialog(null,"De som van de cijfers is " + som);
    }

}
