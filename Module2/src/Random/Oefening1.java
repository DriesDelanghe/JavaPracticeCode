package Random;
import javax.swing.*;
import java.util.Random;

public class Oefening1 {
    public static void main(String[] args) {
        int maxGetal;

        maxGetal = Integer.parseInt(JOptionPane.showInputDialog("Wat is het maximum getal?"));

        Random r = new Random();

        int getal = r.nextInt(maxGetal);

        JOptionPane.showMessageDialog(null, getal);

    }
}
