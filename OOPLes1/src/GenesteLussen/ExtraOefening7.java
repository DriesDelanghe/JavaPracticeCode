package GenesteLussen;

import javax.swing.*;

public class ExtraOefening7 {
    public static void main(String[] args) {
        int temp = 0;
        int temp2 = 0;
        int plaats = 0;
        int bestemming;
        int verschuiving;
        boolean flag = true;
        int aantalIteraties = 0;

        int lengte = Integer.parseInt(JOptionPane.showInputDialog("geef lengte van de array"));
        int[] getallen = new int[lengte];

        for (int i = 0; i < lengte; i++) {
            getallen[i] = i+1;
        }

        verschuiving = Integer.parseInt(JOptionPane.showInputDialog("Geef een verschuiving op van 1 tot " + (getallen.length-1)));

        while (verschuiving > getallen.length - 1) {
            JOptionPane.showMessageDialog(null, "De verschuiving moet tussen 1 en " + (getallen.length -1) + " liggen");
            verschuiving = Integer.parseInt(JOptionPane.showInputDialog("Geef een verschuiving op van 1 tot " + (getallen.length-1)));
        }

        for (int i = 0; i < getallen.length; i++) {

            if (getallen.length % 2 == 0) {
                if (plaats == 0 && i != 0) {
                    plaats = verschuiving - (aantalIteraties+1);
                    if (flag) {
                        temp = getallen[plaats];
                    } else if (!flag) {
                        temp2 = getallen[plaats];
                    }
                    aantalIteraties++;
                }

            }

            if (plaats - verschuiving >= 0) {
                bestemming = plaats - verschuiving;
            } else {
                bestemming = getallen.length + (plaats - verschuiving);
            }
            if (i == 0) {
                temp = getallen[bestemming];
                getallen[bestemming] = getallen[plaats];
            } else if (i < getallen.length) {
                if (flag) {
                    temp2 = getallen[bestemming];
                    getallen[bestemming] = temp;
                    flag = false;
                } else if (!flag) {
                    temp = getallen[bestemming];
                    getallen[bestemming] = temp2;
                    flag = true;
                }
            }
            plaats = bestemming;
        }

        String s = "De array: \n";

        for (int i = 0; i < getallen.length; i++) {
            s += getallen[i] + " ";
        }

        JOptionPane.showMessageDialog(null, s);

    }
}
