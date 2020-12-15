package Static;

public class testOefening7 {
    public static void main(String[] args) {
        String[] Lijst = {"Zoe", "Jan", "Fred", "Karl", "Anne", "Dirk", "Gertjan", "Zoe", "Gertjan"};
        Oefening7 o = new Oefening7();

        o.printNamenAlfabetisch(Lijst);
        System.out.println(o.zoekKortste(Lijst));
        System.out.println(o.zoekLangste(Lijst));
        System.out.println(o.aantalVoorkomen(Lijst));

    }
}
