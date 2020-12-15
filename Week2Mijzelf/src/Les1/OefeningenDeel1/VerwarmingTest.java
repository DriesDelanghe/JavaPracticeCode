package Les1.OefeningenDeel1;

public class VerwarmingTest {
    public static void main(String[] args) {
        Verwarming verwarming1 = new Verwarming(15, 32, 2);
        Verwarming verwarming2 = new Verwarming(12,40,-2);

        verwarming2.OphoogWaardeWijzigen(2);
        verwarming2.Warmer();
        verwarming1.Kouder();
    }

}
