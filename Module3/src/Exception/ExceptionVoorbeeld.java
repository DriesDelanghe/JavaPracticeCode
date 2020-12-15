package Exception;

import javax.swing.*;
import java.util.ArrayList;

public class ExceptionVoorbeeld {
    private int[] lijst = new int[5];
    private ArrayList<String> woorden = new ArrayList<>();

    public ExceptionVoorbeeld() {
    }

    public void leesGetallen(){

        for (int i = 0; i <= lijst.length; i++) {
            try {
                lijst[i] = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
                woorden.add(lijst[i]+"");
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "geef verplicht een getal op, gebruik cijfers");
                i--;
            }catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "The programmer is stupid: " + e.getMessage());
            }
           /* catch(Exception e){
                System.out.println("Er is een fout " + e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
                i--;
            }*/
        }

    }
}
