public class TestMembership {
    public static void main(String[] args) {
        Membership m1 = new Membership(17412, "Paul Doog",true);
        Membership m2 = new Membership(21849, "Lise Steel", false);

        Item i1 = new Item(0, "het verdriet van belgië");
        Item i2 = new Item(2, "70 jaar muziek", 7.2);
        Item i3 = new Item(1, "Sound of disaster", 0.6);
        Item i4 = new Item(3, "De morgen", 0.2);
        Item i5 = new Item(0, "De verworpenen");

        Register r1 = new Register(m1);

        r1.leen(i1);
        r1.leen(i2);
        r1.leen(i3);
        r1.leen(i4);
        r1.leen(i5);

        r1.aanvaard();

        System.out.println(r1.maakBon());
    }
}
