public class Testklasse {
    public static void main(String[] args) {

        Afdeling boekhouding = new Afdeling("boekhouding", "Brussel");
        Afdeling verkoop = new Afdeling("Verkoop", "Antwerpen");

        Bediende mieke = new Bediende("Mieke", 1600);
        Bediende marina = new Bediende("Marina", 1800);

        mieke.setAfdeling(verkoop);
        marina.setAfdeling(boekhouding);

        mieke.verhoogSalaris(1800);
        marina.verhoogSalaris(100);

        System.out.println(mieke.toString());
        System.out.println(marina.toString());
    }
}

