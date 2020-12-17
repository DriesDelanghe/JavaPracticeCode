package Oefening4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class coderenDecoderen {
    private HashMap<Character, Integer> secretMap = new HashMap<>();

    public coderenDecoderen() {
        fillSecretMap();
    }

    private void fillSecretMap() {
        secretMap.put(' ', 0);
        secretMap.put('a', 1);
        secretMap.put('b', 2);
        secretMap.put('c', 3);
        secretMap.put('d', 4);
        secretMap.put('e', 5);
        secretMap.put('f', 6);
        secretMap.put('g', 7);
        secretMap.put('h', 8);
        secretMap.put('i', 9);
        secretMap.put('j', 10);
        secretMap.put('k', 11);
        secretMap.put('l', 12);
        secretMap.put('m', 13);
        secretMap.put('n', 14);
        secretMap.put('o', 15);
        secretMap.put('p', 16);
        secretMap.put('q', 17);
        secretMap.put('r', 18);
        secretMap.put('s', 19);
        secretMap.put('t', 20);
        secretMap.put('u', 21);
        secretMap.put('v', 22);
        secretMap.put('w', 23);
        secretMap.put('x', 24);
        secretMap.put('y', 25);
        secretMap.put('z', 26);
        secretMap.put('.', 27);

    }

    public void printSleutel(){
        Iterator it = secretMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair);
        }
    }

    public String codeerBoodschap(String boodschap){
        char[] charactersMessage = new char[boodschap.length()];
        int[] cryptedMessage = new int[boodschap.length()];
        String s = "";

        boodschap = boodschap.toLowerCase();
        boodschap.getChars(0, boodschap.length(), charactersMessage, 0);

        for (int i = 0; i < boodschap.length(); i++) {
            cryptedMessage[i] = secretMap.get(charactersMessage[i]);
            s+= cryptedMessage[i] + " ";
        }
        System.out.println(s);
        return s;
    }

    public void decodeMessage(String encryptedMessage){
        ArrayList<Character> CharactersSentence = new ArrayList<>();

        encryptedMessage = encryptedMessage.trim();
        String[] MessageCharacters = encryptedMessage.split(" ");
        for(String s: MessageCharacters){
            for(char key: secretMap.keySet()){
                if(Integer.parseInt(s) == secretMap.get(key)){
                    CharactersSentence.add(key);
                }
            }
        }
        String s = "";
        for (char c : CharactersSentence.toArray(new Character[0])){
            s+= c;
        }

        System.out.println(s);
    }
}