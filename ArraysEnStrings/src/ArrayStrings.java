import javax.swing.*;

public class ArrayStrings {
    private String[] lijstNamen = new String[5];
    private int[] listPassword = new int[5];


    public ArrayStrings() {
/*
        for (int i = 0; i < 5; i++) {
            lijstNamen[i] = JOptionPane.showInputDialog("geef een naam op");
            listPassword[i] = Integer.parseInt(JOptionPane.showInputDialog("Geef een paswoord op"));
        }
*/

    }

    public void setLijstNamen(String[] lijstNamen) {
        this.lijstNamen = lijstNamen;
    }

    public void setListPassword(int[] listPassword) {
        this.listPassword = listPassword;
    }

    public void drukAf() {
        for (int i = 0; i < lijstNamen.length; i++) {
            System.out.println(lijstNamen[i]);
            System.out.println(listPassword[i]);
        }
    }

    public int zoek(String name) {

        int position = -1;
        String QueryName = name;

        for (int i = 0; i < lijstNamen.length; i++) {
            if (QueryName.equals(lijstNamen[i])) {
                position = i;
            }
        }
        return position;

    }

    public void login() {

        String username = JOptionPane.showInputDialog("Geef gebruikersnaam");

        int positionName = zoek(username);
        if(positionName != -1){
            int PasswordUser = Integer.parseInt(JOptionPane.showInputDialog("Geef paswoord"));
            if(PasswordUser == listPassword[positionName]){
                JOptionPane.showMessageDialog(null, "u bent ingelogd");
            }else{
                JOptionPane.showMessageDialog(null, "u hebt geen toegang");
            }

        }else{
            JOptionPane.showMessageDialog(null, "De username staat niet in de database");
        }



    }
}

