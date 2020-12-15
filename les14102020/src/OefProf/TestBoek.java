package OefProf;

public class TestBoek {

    public static void main(String[] args) {

        Auteur a = new Auteur("Koch");
        Boek b1 = new Boek("ISBN1", "titel1", 20);
        Boek b2 = new Boek("ISBN2", "titel2", 25);
        Boek b3 = new Boek("ISBN3", "titel3", 30);

        a.VoegToe(b1);
        a.VoegToe(b2);
        a.VoegToe(b3);

        System.out.println(a);

        a.VerhoogPrijs10Procent();
        System.out.println(b1);

    }
}
