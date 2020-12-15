package Random;


import java.util.ArrayList;
import java.util.Random;

public class UitbereidingLotto {

    public static void main(String[] args) {
        ArrayList<Integer> LottoNumbers = new ArrayList<>();
        ArrayList<Integer> MyNumbers = new ArrayList<>();

        GenerateNumbers(LottoNumbers);

        for (int j = 0; j < 100000; j++) {

            GenerateNumbers(MyNumbers);

            int equal = CompareArraylists(LottoNumbers, MyNumbers);

            if(equal > 3){

                for (int i = 0; i < LottoNumbers.size(); i++) {
                    System.out.print(LottoNumbers.get(i) + "\t");
                }
                System.out.println("");
                for (int i = 0; i < MyNumbers.size(); i++) {
                    System.out.print(MyNumbers.get(i) + "\t");
                }
                System.out.println();

                System.out.println( equal + "\n");
            }

            MyNumbers.clear();

        }

    }

    public static void GenerateNumbers(ArrayList arraylist){
        Random r = new Random();
        for (int i = 0; i < 7; i++) {
            arraylist.add(r.nextInt(45) + 1);
        }
    }

    public static int CompareArraylists(ArrayList mainNumbers, ArrayList myNumbers){
        int AmountEqual = 0;

        for (int i = 0; i < mainNumbers.size(); i++) {
            if(mainNumbers.get(i) == myNumbers.get(i)){
                AmountEqual++;
            }
        }

        return AmountEqual;
    }
}
