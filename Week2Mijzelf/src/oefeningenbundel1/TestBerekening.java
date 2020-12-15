package oefeningenbundel1;

public class TestBerekening {
    public static void main(String[] args) {
        Berekening b = new Berekening(200,10,"deel");
        System.out.println(b);
        b.bewerkingMaken();
    }
}
