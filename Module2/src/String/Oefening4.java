package String;

public class Oefening4 {
    public static boolean isPallindroom(String woord){
        boolean isPallindroom = true;

        for (int i = 0; i < woord.length(); i++) {
            if(woord.charAt(i) != woord.charAt(woord.length() - 1 - i)){
                isPallindroom =false;
            }
        }
        
        return isPallindroom;
    }

    public static void main(String[] args) {
        String woord = "yeet";
        String woord2 = "yeey";

        System.out.println(isPallindroom(woord));
        System.out.println(isPallindroom(woord2));
    }
}
