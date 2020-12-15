package Static;

public class Oefening8 {

    public Oefening8() {
    }

    public boolean isGeldigRekeningNummer(String reknr){
        reknr = reknr.replaceAll(" ", "");
        boolean matches = reknr.matches("BE[\\d]{14}");
        boolean isGeldig = false;

        if(matches){
            reknr = reknr.replace("BE", "");
            String s1 = reknr.substring(2, 12);
            String s2 = reknr.substring(12);

            long l1 = Long.parseLong(s1);
            long l2 = Long.parseLong(s2);
            long predictl2 = l1%97;
            if(predictl2 == l2){
                isGeldig = true;
            }else{
                isGeldig = false;
            }
        }else{
            return false;
        }

        return isGeldig;
    }
}
