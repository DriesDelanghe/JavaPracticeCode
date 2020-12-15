package oefeningenbundel1;

public class TestBoek {
    public static void main(String[] args) {
        Boek b = new Boek("Koch", "Het zomerhuis");
        System.out.println(b);
        b.verhoogAantalKeerUitgeleend();
        b.setAantalKeerUitgeleend(100);
        b.verhoogAantalKeerUitgeleend();
    }
}
