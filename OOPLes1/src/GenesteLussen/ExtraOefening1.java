package GenesteLussen;

import java.util.Arrays;

public class ExtraOefening1 {
    public static void main(String[] args) {
        double[] nummers = {1,2,3,4,5,6,7,8,9,10};
        int indexMediaan;
        double mediaan;

        Arrays.sort(nummers);

        if(nummers.length%2 == 0){
            indexMediaan = nummers.length/2;
            int indexMediaan2 = (nummers.length/2) +1;
            mediaan = (nummers[indexMediaan - 1] + nummers[indexMediaan2 - 1])/2;
        }else{
            indexMediaan=(nummers.length+1)/2;
            mediaan = nummers[indexMediaan - 1];
        }

        System.out.println(mediaan);
    }
}
