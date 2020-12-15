package String;

public class Oefening5 {
    public static void printWoorden(String zin){
        zin = zin.replaceAll(" +", "\n");
        zin = zin.replaceAll("[?,;.:]", "");
        System.out.println(zin);
    }

    public static void main(String[] args) {
        String zin = "ik denk dat dit juist is?";
        printWoorden(zin);
    }
}
