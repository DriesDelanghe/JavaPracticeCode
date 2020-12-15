package String;

public class Oefening3 {

    public static void printKlinkerSpatie(String woord){
        woord = woord.replaceAll("[aeiouAEIOU]+", " ");
        System.out.println(woord);
    }

    public static void main(String[] args) {
        String s = "yeet";
        printKlinkerSpatie(s);
    }
}
