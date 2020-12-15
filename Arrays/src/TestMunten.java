import javax.swing.*;

public class TestMunten {
    public static void main(String[] args) {
        int bedrag = Integer.parseInt(JOptionPane.showInputDialog("Geef het bedrag"));

        int aantal = 0;
        int[] MuntenAantal = new int[6];
        int[] MuntenWaarde = {50, 20, 10, 5, 2, 1};


        for (int i = 0; i < MuntenAantal.length; i++) {
            while ((bedrag - MuntenWaarde[i]) >= 0) {
                bedrag -= MuntenWaarde[i];
                aantal++;
            }
            MuntenAantal[i] = aantal;
            aantal = 0;
        }

        System.out.println("Voor het bedrag van " + bedrag + " heb je volgende muntstukken of briefjes nodig:");
        for (int i = 0; i < MuntenAantal.length; i++) {
            if (MuntenAantal[i] != 0) {
                System.out.println(MuntenWaarde[i] + " : " + MuntenAantal[i] + " keer");
            }

        }

    }
}
