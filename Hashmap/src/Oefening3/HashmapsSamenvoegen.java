package Oefening3;

import java.util.HashMap;

public class HashmapsSamenvoegen {
    private HashMap<String, String> map1 = new HashMap<>();
    private HashMap<String, String> map2 = new HashMap<>();
    private HashMap<String, String> samen = new HashMap<>();

    public HashmapsSamenvoegen() {
        map1.put("a", "b");
        map2.put("b", "c");
        //wordt in samen ("a", "c")
        //
        map1.put("d", "e");
        map2.put("e", "f");
    }

    public void voegSamen(){
        for (String item1: map1.keySet()){
            for(String item2: map2.keySet()){
                if(map1.get(item1).equals(item2)){
                    samen.put(item1, map2.get(item2));
                }
            }
        }

        for(String letter: samen.keySet()){
            String s = letter + " " + samen.get(letter);
            System.out.println(s);
        }
    }


}