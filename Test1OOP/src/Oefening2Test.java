public class Oefening2Test {
    public static void main(String[] args) {
        Oefening2 o2 = new Oefening2();
        if (o2.checkGetal(496))
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("Niet OK");
        }

        System.out.println(o2.genereerGetal(100));
    }
}
