import javax.swing.*;

public class Oef3 {
    public static void main(String[] args) {
        int min;
        int max;

        min = Integer.parseInt(JOptionPane.showInputDialog("Geef min getal"));
        max = Integer.parseInt(JOptionPane.showInputDialog("Geef max getal"));
        System.out.println("kwadraten van alle getallen vanaf " + min + " tot en met" + max);
        for(int i = min; i <= max; i++){
            int kwadraat = i*i;

            System.out.println("Het kwadraat van " + i + " is " + kwadraat);
        }
    }
}
