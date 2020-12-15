import javax.swing.*;

public class Array {
    private final double[] Getallen = new double[5];

    public Array() {
        for (int i = 0; i < 5; i++) {
            String invoer = JOptionPane.showInputDialog("Geef getal");
            double getal = Integer.parseInt(invoer);
            this.Getallen[i] = getal;
        }
    }


    public void drukAf() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Getallen[i]);
        }
    }

    public void drukAfOmgekeerd() {
        for (int i = 4; i >= 0; i--) {
            System.out.println(Getallen[i]);
        }
    }

    public void berekenSom() {
        int som = 0;
        for (int i = 0; i < 5; i++) {
            som += Getallen[i];
        }
        System.out.println(som);
    }

    public void berekenGemiddelde() {
        double gemiddelde = 0;
        for (int i = 0; i < 5; i++) {
            gemiddelde += Getallen[i];
        }
        gemiddelde = gemiddelde / 5;

        System.out.println(gemiddelde);
    }

    public void drukGetallenGroterDanTien() {
        for (int i = 0; i < 5; i++) {
            if (Getallen[i] > 10) {
                System.out.println(Getallen[i]);
            }
        }
    }

    public void vermenigvuldig() {
        double resultaat = 1;
        for (int i = 0; i < 5; i++) {
            if (Getallen[i] != 0) {
                resultaat *= Getallen[i];
            }
        }

        System.out.println(resultaat);
    }

    public void verschilGemiddelde() {
        int gemiddelde = 0;
        for (int i = 0; i < 5; i++) {
            gemiddelde += Getallen[i];
        }

        gemiddelde = gemiddelde / 5;

        for (int i = 0; i < 5; i++) {
            Getallen[i] = Getallen[i] - gemiddelde;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Getallen[i]);
        }

    }

    public void duplicaten() {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Getal"));
        int aantal = 0;

        for (int i = 0; i < 5; i++) {
            if (getal == Getallen[i]) {
                aantal++;
            }
        }

        System.out.println("het getal komt " + aantal + " keer voor");

    }

    public void grootsteGetal() {
        double grootste = 0;
        double kleinste = 0;
        int positieGrootste = 0;
        int positieKleinste = 0;
        double temp;

        for (int i = 0; i < 5; i++) {
            if (Getallen[i] > grootste) {
                grootste = Getallen[i];
                positieGrootste = i;
            }
        }
        kleinste = grootste;
        for (int i = 0; i < 5; i++) {
            if (Getallen[i] < kleinste) {
                kleinste = Getallen[i];
                positieKleinste = i;
            }

        }

        temp = Getallen[positieKleinste];
        Getallen[positieKleinste] = Getallen[positieGrootste];
        Getallen[positieGrootste] = temp;

        System.out.println("het grootste getal is " + grootste + " plaats: " + positieGrootste);

        drukAf();

    }

    public void MeestVoorkomendGetal() {
        int[] arrayAantal = new int[Getallen.length];
        int aantal = 0;
        int GrootsteAantalPositie = 0;
        int GrootsteAantal = 0;

        for (int i = 0; i < Getallen.length; i++) {
            for (int j = 0; j < Getallen.length; j++) {
                if (Getallen[i] == Getallen[j]) {
                    aantal++;
                }
                arrayAantal[i] = aantal;
            }
            aantal = 0;
        }

        for (int i = 0; i < Getallen.length; i++) {
            if (arrayAantal[i] > GrootsteAantal) {
                GrootsteAantal = arrayAantal[i];
                GrootsteAantalPositie = i;
            }
        }

        System.out.println("het grootste getal is " + Getallen[GrootsteAantalPositie] +
                " en komt " + GrootsteAantal + " keer voor");
    }

    public void ArrayOmwisselen() {
        double temp;
        int position;

        for (int i = 0; i < Getallen.length / 2; i++) {
            temp = Getallen[i];
            position = Getallen.length - (1 + i);
            Getallen[i] = Getallen[position];
            Getallen[position] = temp;
        }

        drukAf();
    }


}





