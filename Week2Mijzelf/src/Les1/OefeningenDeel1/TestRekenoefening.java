package Les1.OefeningenDeel1;

public class TestRekenoefening {
    public static void main(String[] args) {
        Rekenoefening oefening1 = new Rekenoefening(2,4, "min");
        Rekenoefening oefening2 = new Rekenoefening(5,12,"Plus");
        Rekenoefening oefening3 = new Rekenoefening(12,14,"Maal");

        oefening3.DoBewerking();
        oefening1.DoBewerking();
        oefening2.DoBewerking();

    }

}
