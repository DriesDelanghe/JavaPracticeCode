package Les1.OefeningenDeel1;

public class Datum {

    private String dag;
    private String maand;
    private String jaar;

    public Datum(String dag, String maand, String jaar) {
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    public void DrukAf(){
        System.out.println(dag + "/" + maand + "/" + jaar);
    }
}
