package Oefeningen.Rapport;

public class TestRapport {
    public static void main(String[] args) {
        Opleidingsonderdeel o1 = new Opleidingsonderdeel(10,"Frans");
        Opleidingsonderdeel o2 = new Opleidingsonderdeel(11,"Java");
        Opleidingsonderdeel o3 = new Opleidingsonderdeel(10,"Databanken");
        Student studJan = new Student("1IMSA","Jan");
        Rapport rapJan = new Rapport(studJan);
        rapJan.voegtoe(o1);
        rapJan.voegtoe(o2);
        rapJan.voegtoe(o3);
        System.out.println(rapJan);
    }

}
