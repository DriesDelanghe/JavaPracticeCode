package Oefening4;

import javax.swing.*;

public class CoderenDecoderenTest {
    public static void main(String[] args) {
        coderenDecoderen c = new coderenDecoderen();
        c.printSleutel();
        String input = JOptionPane.showInputDialog("geef een zin op:");
        String s = c.codeerBoodschap(input);
        c.decodeMessage(s);
    }
}
