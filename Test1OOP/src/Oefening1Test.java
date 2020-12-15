public class Oefening1Test {

    public static void main(String[] args) {
        Oefening1 o = new Oefening1();
        boolean OK = o.controleer("Ik ben een kapoen.");
        if (!OK) {
            System.out.println("Besluit : De zin is niet juist.");
        }
    }
}
