package Static;

public class Oefening8Test {
    public static void main(String[] args) {
        String Bankrekeningnummer ="BE28 7430 0235 7720";

        Oefening8 o = new Oefening8();
        boolean isGeldig = o.isGeldigRekeningNummer(Bankrekeningnummer);
        System.out.println(isGeldig);
    }
}
