package WhileLoops;

import javax.swing.*;

public class Oefening7 {

    public static void main(String[] args) {

        double spaargeld;
        double renteVoet;
        double spaarDoel;
        int aantalJaar = 1;

        spaargeld = Double.parseDouble(JOptionPane.showInputDialog("Geef je start spaargeld"));
        renteVoet = Double.parseDouble(JOptionPane.showInputDialog("Geef je rentevoet"));
        spaarDoel = Double.parseDouble(JOptionPane.showInputDialog("Geef je spaardoel"));

        while(spaargeld < spaarDoel){
            System.out.println("jaar " + aantalJaar + ": " + (spaargeld));
            spaargeld += spaargeld*renteVoet;
            aantalJaar++;
        }
        System.out.println("jaar " + aantalJaar + ": " + (spaargeld));

        JOptionPane.showMessageDialog(null, "Voor een bedrag van " + spaarDoel
        + " moet je je spaargeld " + aantalJaar + " laten staan.");
    }
}
