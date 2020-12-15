package GenesteLussen;

import javax.swing.*;

public class ExtraOefening4 {
    public static void main(String[] args) {

        int hoogteKruin = Integer.parseInt(JOptionPane.showInputDialog("uit hoeveel rijen moet de kerstboom zonder stam bestaan?"));
        int hoogteStam = hoogteKruin / 4;

        int breedteKruin = (hoogteKruin - 1) * 2 + 1;
        int breedteStam = breedteKruin / 3;

        if(hoogteStam == 0){
            hoogteStam = 1;
            breedteStam = 1;
        }

        int totaleHoogte = hoogteStam + hoogteKruin;

        int middenKruin;
        int middenKruin2 = 0;

        if (breedteKruin % 2 == 0) {
            middenKruin = breedteKruin / 2;
            middenKruin2 = (breedteKruin / 2) + 1;
        } else {
            middenKruin = (breedteKruin + 1) / 2;
            middenKruin2 = middenKruin;
        }

        int uitwijding = 0;
        int uitwijdingStam = breedteStam / 2;

        for (int i = 0; i < totaleHoogte; i++) {
            for (int j = 0; j < breedteKruin; j++) {
                if (i < hoogteKruin) {
                    if (j >= (middenKruin - 1) - uitwijding && j <= (middenKruin2 - 1) + uitwijding) {
                        System.out.print("* \t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j >= (middenKruin-1) - uitwijdingStam && j <= (middenKruin-1) + uitwijdingStam) {
                        System.out.print("* \t");
                    } else {
                        System.out.print("\t");
                    }
                }

            }
            uitwijding++;
            System.out.println("");
        }
        System.out.println(breedteStam);

    }

}
