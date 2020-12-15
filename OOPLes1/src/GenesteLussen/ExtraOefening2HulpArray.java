package GenesteLussen;

public class ExtraOefening2HulpArray {
    public static void main(String[] args) {
        int[] getal = {1,2,3,4,5,6,7,8,9,10};
        int[] hulparray = new int[getal.length];

        for (int i = 0; i < getal.length; i++) {
            //i is index getal, i-2 = positie hulparray;
            if(i-2 < 0){
                int positieNul = getal.length - 2 + i;
                hulparray[positieNul] = getal[i];
            }else{
                hulparray[i-2] = getal[i];
            }
        }

        for (int i = 0; i < getal.length; i++) {
            System.out.print(getal[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < hulparray.length; i++) {
            System.out.print(hulparray[i] + "\t");
        }

    }
}
