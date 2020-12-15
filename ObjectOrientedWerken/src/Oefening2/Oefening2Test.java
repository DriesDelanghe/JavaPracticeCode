package Oefening2;

public class Oefening2Test {
    public static void main(String[] args) {
        Klant k = new Klant("Peeters", "Vera", "Vera.Peeters@thomasmore.be");
        Student s = new Student("Janssens", "Ben",
                "Ben.Janssens@student.thomasmore.be","Thomas More");
        Artikel a = new Artikel("Monopoly", 30, 5);
        //klant koopt en betaalt
        System.out.println(k.koop(a));
        //student koopt en betaalt
        System.out.println(s.koop(a));

    }
}
