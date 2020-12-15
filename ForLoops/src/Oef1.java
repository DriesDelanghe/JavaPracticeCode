import javax.swing.*;

public class Oef1 {
    public static void main(String[] args) {
        int getal;
        int som = 0;
        for(int i = 1; i <= 5; i++){
            getal = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
            som += getal;
        }

        System.out.println("De som is " + som);
    }
}
