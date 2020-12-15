package GenesteLussen;

import javax.swing.*;


public class ExtraOefening3 {
    public static void main(String[] args) {
        int breedte;
        String input;
        int indexMidden = 0;
        int indexMidden2 = 0;
        int stars = 0;
        int hoogte = 0;

        input = JOptionPane.showInputDialog("Hoe breed moet de ruit zijn?");
        breedte = Integer.parseInt(input);

        if (breedte % 2 == 0) {
            indexMidden = breedte / 2;
            indexMidden2 = (breedte / 2) + 1;
        } else {
            indexMidden = (breedte + 1) / 2;
        }

        for (int i = 0; i < breedte; i++) {
            for (int j = 0; j < breedte; j++) {
                if (j >= (indexMidden - 1) - stars && j <= (indexMidden2 - 1) + stars) {
                    System.out.print("* \t");
                } else {
                    System.out.print("\t");
                }

            }
            hoogte++;
            System.out.println();
            if (indexMidden > hoogte) {
                stars++;
            } else if (indexMidden <= hoogte) {
                stars--;
            }
        }
    }
}

