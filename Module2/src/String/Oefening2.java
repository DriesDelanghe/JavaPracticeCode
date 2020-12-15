package String;

public class Oefening2 {
    public static void schrapLeesTekensSpaties(String zin){
        zin = zin.replaceAll("[^A-za-z]+", "");
        System.out.println(zin);
    }

    public static void main(String[] args) {
        String s = "Ik heb echt geen idee, wat ik aan het doen ben.";
        schrapLeesTekensSpaties(s);
    }
}
