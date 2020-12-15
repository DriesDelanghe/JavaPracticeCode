public class TestReis {
    public static void main(String[] args) {

        Reis reis1 = new Reis(1000, "Rome");
        Reis reis2 = new Reis(1500, "New York", false);

        System.out.println(reis1.toString());
        System.out.println(reis2.toString());

        reis1.drukAf();
        reis2.drukAf();
    }
}
