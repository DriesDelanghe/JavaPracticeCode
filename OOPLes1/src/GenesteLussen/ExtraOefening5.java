package GenesteLussen;

import javax.swing.*;

public class ExtraOefening5 {


    public static void main(String[] args) {

        int beginGetal = Integer.parseInt(JOptionPane.showInputDialog("Wat is het begin getal?"));
        int lengte = Integer.parseInt(JOptionPane.showInputDialog("Uit hoeveel getallen moet de reeks bestaan?"));

        int getal = beginGetal;

        System.out.print(getal + " ");

        int i = 1;

        while( i < lengte){
            getal -= 2;
            System.out.print(getal + " ");
            i ++;
            if(i < lengte){

                getal += 1;
                System.out.print(getal + " ");
                i++;
            }else{
                break;
            }
        }

    }
}
