package Random;

import javax.swing.*;
import java.util.Random;

public class Oefening4 {
    public static void main(String[] args) {
        Random r = new Random();
        int guessNr = 0;
        int guess;
        int puntenGuess = 0;
        int punten = 0;
        boolean won = false;

        String input = JOptionPane.showInputDialog("Om te starten type 'START'");

        while(!input.equals("NEE")){
            int getal = r.nextInt(6) + 1;

            while(guessNr < 3 && !won){
                input = JOptionPane.showInputDialog("raad het getal! \n Het getal ligt tussen 1 en 6");
                guess = Integer.parseInt(input);

                if(guess != getal){
                    JOptionPane.showMessageDialog(null, "fout! probeer opnieuw!");
                    guessNr ++;
                }else{
                    puntenGuess = 6-guessNr;
                    won = true;
                    punten += puntenGuess;
                }
            }

            if(won){
                JOptionPane.showMessageDialog(null, "Juist!, je verdiend " + puntenGuess + " punten \n" +
                        "Je puntentotaal is nu: " + punten);
            }else{
                JOptionPane.showMessageDialog(null, "helaas, niet gewonnen! \n Je puntentotaal is: " + punten);
            }

            input = JOptionPane.showInputDialog("Nog eens? om te stoppen type NEE");
            guessNr = 0;
            won = false;
        }


    }
}
