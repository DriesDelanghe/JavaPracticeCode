package Week1.Les1.Person;

public class TestPersoon {
    public static void main(String[] args) {
        Persoon peter = new Persoon ("Janssens", "Peter", "Brussel");
        Persoon jan = new Persoon("Peeters", "Jan", "Antwerpen");
        peter.print();
        jan.print();
    }
}
