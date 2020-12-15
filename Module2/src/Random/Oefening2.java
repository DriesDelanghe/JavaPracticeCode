package Random;

import javax.swing.*;
import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {
        int maxGetal;
        int minGetal;

        minGetal = Integer.parseInt(JOptionPane.showInputDialog("wat is de minimum waarde?"));
        maxGetal = Integer.parseInt(JOptionPane.showInputDialog("wat is de maximum waarde?"));
        Random r = new Random();

        int getal = r.nextInt(maxGetal);

        while(getal < minGetal ){
            getal = r.nextInt(maxGetal);
        }

        System.out.println(getal);


    }
}
