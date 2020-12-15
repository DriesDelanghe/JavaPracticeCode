package Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Oefening7 {

    public Oefening7() {
    }

    public void printNamenAlfabetisch(String[] namen) {
        Arrays.sort(namen);

        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }
    }

    public ArrayList<String> zoekKortste(String[] namen) {
        ArrayList<String> korsteNamen = new ArrayList<String>();
        int korsteLengte = namen[0].length();

        for (int i = 0; i < namen.length; i++) {
            if (korsteLengte > namen[i].length()) {
                korsteLengte = namen[i].length();
            }
        }

        for (int i = 0; i < namen.length; i++) {
            if (korsteLengte == namen[i].length() && !korsteNamen.contains(namen[i])) {
                korsteNamen.add(namen[i]);
            }
        }
        return korsteNamen;
    }

    public ArrayList<String> zoekLangste(String[] namen) {
        ArrayList<String> langsteNamen = new ArrayList<String>();
        int langsteLengte = namen[0].length();

        for (int i = 0; i < namen.length; i++) {
            if (langsteLengte < namen[i].length()) {
                langsteLengte = namen[i].length();
            }
        }

        for (int i = 0; i < namen.length; i++) {
            if (langsteLengte == namen[i].length() && !langsteNamen.contains(namen[i])) {
                langsteNamen.add(namen[i]);
            }
        }
        return langsteNamen;
    }

    public ArrayList<String> enkelvoudigeLijst(String[] lijst) {
        ArrayList<String> enkelvoudigeNamen = new ArrayList<>();

        for (int i = 0; i < lijst.length; i++) {
            if (!enkelvoudigeNamen.contains(lijst[i])) {
                enkelvoudigeNamen.add(lijst[i]);
            }
        }
        return enkelvoudigeNamen;
    }

    public ArrayList<Voorkomen> aantalVoorkomen(String[] lijst) {
        ArrayList<Voorkomen> voorkomstNamen = new ArrayList<>();
        ArrayList<String> namen = enkelvoudigeLijst(lijst);

        for (int i = 0; i < namen.size(); i++) {
            voorkomstNamen.add(new Voorkomen(namen.get(i), 0));
        }

        for (int i = 0; i < lijst.length; i++) {
            for (Voorkomen persoon : voorkomstNamen) {
                if (persoon.getWoord().equals(lijst[i])) {
                    persoon.addAantal();
                }
            }
        }


        return voorkomstNamen;
    }


}

