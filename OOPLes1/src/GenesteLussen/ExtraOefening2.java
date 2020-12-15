package GenesteLussen;

public class ExtraOefening2 {
    public static void main(String[] args) {
        double[] getallen = {2,4,5,5,6,7,9,10};

        double gemX = 0;
        double gemX2 = 0;

        for (int i = 0; i < getallen.length; i++) {
            gemX += getallen[i];
        }

        gemX = gemX/getallen.length;

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] -= gemX;
            getallen[i] *= getallen[i];
            gemX2 += getallen[i];
        }

        gemX2 = gemX2/getallen.length;
        gemX = Math.sqrt(gemX2);

        System.out.println(gemX2);
        System.out.println(gemX);

    }
}
