public class WeirdPowerTheory {

    public WeirdPowerTheory() {
    }

    public void TheoryTesting(int endValue){
        int firstPower;
        int secondPower;
        int differencePower;
        int expectedResult;
        boolean trueAll = true;

        for (int i = 0; i < endValue; i++) {
            firstPower = i*i;
            secondPower = (i+1)*(i+1);

            differencePower = secondPower - firstPower;
            expectedResult = i + (i+1);
                if(expectedResult == differencePower){
                    String s = "true for " + i + " and " + (i+1);
                    System.out.println(s);
                }else{
                    trueAll = false;
                }
        }

        if(trueAll){
            System.out.println("true for all cases \n");
        }else{
            System.out.println("theory incorrect \n");
        }
    }

    public static void main(String[] args) {
        WeirdPowerTheory p = new WeirdPowerTheory();
        p.TheoryTesting(1000000);
    }
}
