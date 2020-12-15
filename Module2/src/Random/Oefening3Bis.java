package Random;

import java.util.ArrayList;
import java.util.Random;

public class Oefening3Bis {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> lijst = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int getal = r.nextInt(45) + 1;
            while(lijst.contains(getal)){
                getal = r.nextInt(45) +1;
            }
            lijst.add(getal);
        }

        for (int i = 0; i < lijst.size(); i++) {
            System.out.print(lijst.get(i) + "\t");
        }
    }
}
