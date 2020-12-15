package Week1.Les2;

public class PersoonTest {

    public static void main(String[] args) {
        Persoon Peter = new Persoon("Janssens", "Peter", "Brussel");
        Persoon Jan = new Persoon("Peeters", "Jan", "Antwerpen");

        //Peter.Schrijf();
        //Jan.Schrijf();

        Peter.schrijfAnders();
        Jan.schrijfAnders();
    }
}
