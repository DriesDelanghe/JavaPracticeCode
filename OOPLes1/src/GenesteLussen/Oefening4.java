package GenesteLussen;

public class Oefening4 {

    public static void main(String[] args) {

        int maxLength = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < maxLength; j++) {
                System.out.print("* \t");
            }
            System.out.println();
            maxLength++;
        }
    }
}
