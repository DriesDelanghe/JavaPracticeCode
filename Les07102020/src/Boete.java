public class Boete {

    final private double VAST_BEDRAG = 100;
    final private double VARIABEL_BEDRAG_BOETE = 2.5;

    public Boete() {
    }

    public void berekenBoete(double snelheid, double maxSnelheid){
        double boete;
        double extraSnelheid = snelheid-maxSnelheid;

        if(maxSnelheid < snelheid){
            boete = VAST_BEDRAG + (extraSnelheid*VARIABEL_BEDRAG_BOETE);
            System.out.println("Indien je hier voorbij flitst, flitsen wij terug!" + "\n"
            + "Je reed " + extraSnelheid + " km/u te snel, je boete bedraagt " + boete + " euro");
        }

    }
}
