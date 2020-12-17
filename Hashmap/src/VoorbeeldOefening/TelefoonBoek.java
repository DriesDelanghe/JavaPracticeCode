package VoorbeeldOefening;

import java.util.HashMap;

public class TelefoonBoek {
    private HashMap<String, String> contacts = new HashMap<>();

    public TelefoonBoek() {
        contacts.put("Jan", "123");
        contacts.put("Jos", "456");
        contacts.put("Jozef", "789");
    }

    public int telContacten(){
        return contacts.size();
    }

    public String zoekTelefoonnummerOp(String naam){
        if (komtVoor(naam)){
            return contacts.get(naam);
        }else{
            return "Contact unknown";
        }
    }

    public void addContact(String naam, String telefoonnummer){
        contacts.put(naam, telefoonnummer);
    }

    public boolean komtVoor(String naam){
        if(contacts.containsKey(naam)){
            return true;
        }else{
            return false;
        }
    }

    public void alleNamen(){
        for (String naam: contacts.keySet()){
            System.out.println(naam);
        }
    }

    public void alleContacten(){
        for(String naam: contacts.keySet()){
            String s = "naam: " + naam + "\t" + "telefoonnummer: " + contacts.get(naam);
            System.out.println(s);
        }
    }
}
