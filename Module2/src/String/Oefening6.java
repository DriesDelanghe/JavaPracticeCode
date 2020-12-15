package String;

public class Oefening6 {
    public static void printGemiddeldAantalLetters(String[] woorden){
        int gemiddelde = 0;

        for (int i = 0; i < woorden.length; i++) {
            gemiddelde += woorden[i].length();
        }

        gemiddelde = gemiddelde/ woorden.length;
        System.out.println(gemiddelde);
    }

    public static void main(String[] args) {
        String[] woorden = {"yeet", "skeet", "bleed", "feed", "yeeter", "skeeter"};

        printGemiddeldAantalLetters(woorden);
    }
}
