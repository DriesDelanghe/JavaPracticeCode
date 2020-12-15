import java.util.ArrayList;

public class Register {

    private boolean aanvaard;
    private Membership member;
    private ArrayList<Item> Items = new ArrayList<Item>();

    public Register() {
        this.aanvaard = false;
    }

    public Register(Membership member) {
        this.member = member;
        this.aanvaard = false;
    }

    public boolean leen(Item item){
        boolean uitgeleend = false;

        if(Items.size() <5){
            Items.add(item);
            uitgeleend = true;
        }

        return uitgeleend;
    }

    public void aanvaard(){
        if(Items.size() > 0){
            this.aanvaard = true;
        }
    }

    public String maakBon(){
        String s ="";

        double totBijdrage = 0;
        int aantalBoek = 0;
        int aantalAlbum = 0;
        int aantalPartituur = 0;
        int aantalKrant_Tijdschrift = 0;

        if(aanvaard){
            s += member + " heeft wat volgt: \n";
            for(Item i :Items){
                s += i.toString();
                totBijdrage += i.getBijdrage();

                if(i.getType() == 0){
                    aantalBoek++;
                } else if (i.getType() == 1){
                    aantalPartituur++;
                }else if(i.getType() == 2){
                    aantalAlbum++;
                }else if(i.getType() == 3){
                    aantalKrant_Tijdschrift++;
                }
            }
            s += "Totaal: ";
            if(aantalBoek > 0){
                if(aantalBoek == 1){
                    s += "1 boek, ";
                }else{
                    s+= aantalBoek + " boeken, ";
                }
            }
            if(aantalAlbum > 0){
                if(aantalAlbum == 1){
                    s += "1 album, ";
                }else{
                    s += aantalAlbum + " albums, ";
                }
            }
            if(aantalPartituur > 0){
                if(aantalPartituur == 1){
                    s += "1 partituur, ";
                }else{
                    s += aantalPartituur + " partituren, ";
                }
            }
            if(aantalKrant_Tijdschrift > 0 ){
                if(aantalKrant_Tijdschrift == 1){
                    s += "1 krant/tijdschrift, ";
                }else{
                    s += aantalKrant_Tijdschrift + " kranten/tijdschriften, ";
                }
            }

            s += "voor een totale bijdrage van: " + totBijdrage + "€";
        }else{
            s = "het register is niet aanvaard";
        }

        return s;
    }
}
