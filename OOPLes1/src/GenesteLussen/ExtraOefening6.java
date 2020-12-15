package GenesteLussen;

public class ExtraOefening6 {
    public static void main(String[] args) {
        int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8};
        int temp = 0;
        int temp2 = 0;
        int plaats = 0;
        int bestemming;
        int verschuiving = 2;
        boolean flag = true;

        for (int i = 0; i < getallen.length; i++) {

            if (getallen.length % 2 == 0) {
                if (plaats == 0 && i != 0) {
                    plaats = 1;
                    if (flag) {
                        temp = getallen[plaats];
                    } else if (!flag) {
                        temp2 = getallen[plaats];
                    }
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


        for (int i = 0; i < getallen.length; i++) {
            System.out.print(getallen[i] + "\t");
        }

    }


}

