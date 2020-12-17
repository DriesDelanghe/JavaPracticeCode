package Oefening4;

import javax.swing.*;

public class CoderenDecoderenTest {
    public static void main(String[] args) {
        coderenDecoderen c = new coderenDecoderen();
        c.printSleutel();
        String input = JOptionPane.showInputDialog("geef een zin op:");
        c.codeerBoodschap(input);
        c.decodeMessage("5 18 0 23 1 19 0 5 5 14 19 27 27 27 ");
    }
}
