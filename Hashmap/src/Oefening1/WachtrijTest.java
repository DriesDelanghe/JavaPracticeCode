package Oefening1;

public class WachtrijTest {
    public static void main(String[] args) {
        Wachtrij w = new Wachtrij();

        w.voegToeWachtrij("Jan");
        w.voegToeWachtrij("Jef");
        w.voegToeWachtrij("Gert");
        w.voegToeWachtrij("Dirk");
        w.voegToeWachtrij("Jos");
        w.voegToeWachtrij("Fred");

        w.wordtBediend("Jan");
        w.wordtBediend("Fred");
        w.wordtBediend("Dirk");

        w.statusWachtrij();
        w.verwijderBediend();
        w.statusWachtrij();
    }
}
