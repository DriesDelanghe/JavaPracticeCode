package Random;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
public class Oefening4_2 {

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args) {

        String input = "";
        int punten = 0;
        int ronde = 0;
        ArrayList<Integer> puntenPerBeurt = new ArrayList<>();

        Random r = new Random();

        while (!input.equals("NEE") && ronde < 10) {


            int getal = r.nextInt(6) + 1;
            boolean correct = false;
            int GuessNr;

            JOptionPane.showMessageDialog(null, "Ronde " + (ronde + 1) + "!");

            for (GuessNr = 0; GuessNr < 3 && !correct; GuessNr++) {
                String inputGuess = JOptionPane.showInputDialog("raad het getal tussen 1 en 6");
                while( !isNumeric(inputGuess)){
                    inputGuess = JOptionPane.showInputDialog("raad het getal tussen 1 en 6");
                }

                int GuessGetal = Integer.parseInt(inputGuess);

                while (!(GuessGetal <= 6 && GuessGetal >= 1)) {
                    JOptionPane.showMessageDialog(null, "Getal ligt niet tussen 1 en 6!");
                    inputGuess = JOptionPane.showInputDialog("raad het getal tussen 1 en 6");
                    GuessGetal = Integer.parseInt(inputGuess);
                }

                if (GuessGetal == getal) {
                    correct = true;
                } else if (GuessGetal != getal && GuessNr < 2) {
                    JOptionPane.showMessageDialog(null, "Bijna juist, probeer nog maals! pogingen: " + (2 - GuessNr));
                }
            }

            int puntenGuess;

            if (correct) {
                puntenGuess = 7 - GuessNr;
                JOptionPane.showMessageDialog(null, "correct! je verdiend " + puntenGuess + " punten!");
                punten += puntenGuess;
            } else {
                JOptionPane.showMessageDialog(null, "helaas, geen geluk deze keer");
                puntenGuess = 0;
            }

            puntenPerBeurt.add(puntenGuess);

            if (ronde < 9) {
                input = JOptionPane.showInputDialog("Nog een ronde? JA om voort te doen, NEE om te stoppen");

                while (!input.equals("JA") && !input.equals("NEE")) {
                    JOptionPane.showMessageDialog(null, "Geef JA of NEE in.");
                    input = JOptionPane.showInputDialog("Nog een ronde? JA om voort te doen, NEE om te stoppen");
                }
            }
            ronde++;

        }

        int hoogste = 6;
        ArrayList<Integer> MaxBeurten = new ArrayList<>();

        for (int i = 0; i < puntenPerBeurt.size(); i++) {
            if (puntenPerBeurt.get(i) == hoogste) {
                MaxBeurten.add(i + 1);
            }
        }

        String s = "Eind spel! \n Goed gespeeld! je verdiende " + punten + " punten. \n \n";
        for (int i = 0; i < puntenPerBeurt.size(); i++) {
            s += " beurt " + (i + 1) + ": " + puntenPerBeurt.get(i) + "\n";
        }

        if(MaxBeurten.size() != 0){
            s += "\n Beurten met de hoogste scores: ";
            for (int i = 0; i < MaxBeurten.size(); i++) {
                s += "beurt " + MaxBeurten.get(i);
                if (i < MaxBeurten.size() - 1) {
                    s += ", ";
                }
            }
        }


        JOptionPane.showMessageDialog(null, s);

    }
}

