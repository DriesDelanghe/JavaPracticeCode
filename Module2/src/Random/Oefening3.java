package Random;

import java.util.Random;

public class Oefening3 {
    public static void main(String[] args) {
        Random r = new Random();
        int getal = r.nextInt(45) +1;

        int[] lijst = new int[7];
        int teller = 0;

        while(teller < 7){
            boolean found = false;
            for (int i = 0; i < teller && !found; i++) {
                if (lijst[i] == getal){
                    found = true;
                }
            }
            if(found){
                getal = r.nextInt(45)+1;
            }else {
                lijst[teller] = getal;
                teller++;
            }
        }

        for (int i = 0; i < lijst.length; i++) {
            System.out.print(lijst[i] + "\t");
        }
    }
}
