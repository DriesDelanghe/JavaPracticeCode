package oefeningenbundel1;

public class TestBankrekening {
    public static void main(String[] args) {
        Bankrekening b = new Bankrekening("123",1000);
        System.out.println(b);
        b.haalAf(200);
        System.out.println(b);
        b.stort(200);
        System.out.println(b);
    }
}
