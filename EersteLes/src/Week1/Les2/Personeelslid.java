package Week1.Les2;

public class Personeelslid {

    private String persnr;
    private double salaris;
    private double bonus;
    private String naam;

    public Personeelslid(String persnr, double salaris, double bonus, String naam) {
        this.persnr = persnr;
        this.salaris = salaris;
        this.bonus = bonus;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Personeelslid{" +
                "naam='" + naam + '\'' +
                ", persnr='" + persnr + '\'' +
                ", salaris=" + salaris +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {
        Personeelslid Luc = new Personeelslid("1234", 16000, 200, "Luc");

        System.out.println(Luc);
    }
}
