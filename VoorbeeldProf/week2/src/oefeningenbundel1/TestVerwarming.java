package oefeningenbundel1;

public class TestVerwarming {
    public static void main(String[] args) {
        Verwarming v = new Verwarming(5, 30, 2);
        System.out.println(v);
        v.warmer();
        v.setOphoogwaarde(-2);
        System.out.println(v);
    }
}
