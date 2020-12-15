package oefeningenbundel1;

public class TestPersoon {
    public static void main(String[] args) {
        Persoon p = new Persoon("Peter","Janssen","Leuven",2000);
        System.out.println(p);
        //p.schrijf();
        //p.opslag2Procent();
        //p.opslagPercentage(20);
        //System.out.println(p);
        //p.verhoogSal(100);
        //p.verhoogSal(10);
        p.verhoogSal(100,500);
        System.out.println(p);

    }
}
