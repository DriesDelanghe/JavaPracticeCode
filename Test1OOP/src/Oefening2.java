import java.util.ArrayList;
import java.util.Random;

public class Oefening2 {
    public Oefening2() {
    }

    public boolean checkGetal(int getal){
        boolean correct =false;
        ArrayList<Integer> Delers = new ArrayList<>();
        int som = 0;

        for (int i = 1; i < getal; i++) {
            if(getal%i==0){
                Delers.add(i);
                som += i;
            }
        }

        if(som == getal){
            correct = true;
        }

        return correct;
    }

    public int genereerGetal(int max){
        Random r = new Random();

        int getal = r.nextInt(max)+1;

        while(!checkGetal(getal)){
            getal = r.nextInt(max)+1;
        }

        return getal;
    }
}
