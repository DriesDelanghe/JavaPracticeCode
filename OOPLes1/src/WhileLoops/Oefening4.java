package WhileLoops;

import javax.swing.*;
import java.awt.*;

public class Oefening4 {



    public static void main(String[] args) {
        int getal;
        String input;
        int n = 2;
        boolean isPriemgetal = false;

        input = JOptionPane.showInputDialog("Is dit een priemgetal?");
        getal = Integer.parseInt(input);

        while(n < getal-1){
            if(getal%n == 0){
                isPriemgetal = false;
                break;
            }else{
                isPriemgetal = true;
            }

            n++;
        }

        if(isPriemgetal){
            JOptionPane.showMessageDialog(null, getal + " is een priemgetal.");
        }else{
            JOptionPane.showMessageDialog(null, getal + " is geen priemgetal");
        }

    }

}
