public class PersonenEnBediendeTest {
    public static void main(String[] args) {
        Persoon p = new Persoon("Van Goethem", "Anne", "2820");
        Bediende b = new Bediende("Peeters", "Vera", "2800", 3000);
        b.verhoogSal(500);
        System.out.println(p);
        System.out.println(b);
    }
}
