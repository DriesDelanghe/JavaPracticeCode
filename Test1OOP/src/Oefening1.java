import javax.swing.*;

public class Oefening1 {

    public Oefening1() {
    }

    public boolean controleer(String zin){

        Boolean controleer = true;
        zin = zin.toLowerCase();

        if(zin.contains("ik")||zin.contains("mij")||zin.contains("me")){
            System.out.println("De zin heeft iets te maken met jou.");

            if(zin.length() < 20){
                System.out.println("De zin is kort.");
            }else if(zin.length() <30){
                System.out.println("De zin is redelijk lang");
            }else if(zin.length() > 30){
                System.out.println("de zin is zeer lang");
            }

            if(!(zin.endsWith("?") || zin.endsWith(".") || zin.endsWith("!"))){
                System.out.println("Je hebt de zin niet afgesloten met een leesteken!");
                controleer = false;
            }
        }else{
            controleer = false;
        }

        if(zin.matches("[a-z]+")||zin.matches("[a-z]+\\p{Punct}")){
            controleer = false;
            System.out.println( "De zin bestaat slechts uit één woord!");
        }

        return controleer;
    }
}
