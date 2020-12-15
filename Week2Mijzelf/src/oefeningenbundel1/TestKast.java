package oefeningenbundel1;

public class TestKast {
    public static void main(String[] args) {
        Kast k1 = new Kast(180,90,100);
        System.out.println(k1);
        k1.drukAf();
        k1.bereken();
        //k1.wijzigDiepte(120);
        k1.setDiepte(120);
        //naamgeving = setNaamPrivateVariabele
        k1.drukAf();
    }
}
