package main.radio.galgenmaenchen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerword = new Scanner(System.in);
        Character character;

//        List<Character> revealedWordList = new ArrayList<>();
//        initializeStarterWord(revealedWordList, "baum");

        List<Character> revealedWordList = transformStringToCharacterList("baum");

        List<Character> hiddenWordList = new ArrayList<>();
        for (Character c : revealedWordList) {
            hiddenWordList.add('_');
        }

        // lange von liste revealedWordList evaluieren so oft hiddenWordList hinzufugen in liste

        System.out.println("rate die Buchtaben");
        System.out.println("es sind: " + hiddenWordList.size() + " Buchstaben!");
        zeigeSpielfeld(hiddenWordList);
        System.out.println("");
        character = scannerword.next().charAt(0);

        //so lange die liste hiddenWordList nicht komplet von liste revealedWordList ueberschreiben wurde das programm laufen lassen
        while (hiddenWordList.contains('_')) {

            if (revealedWordList.contains(character)) {

                for (int i = 0; i < revealedWordList.size(); i++) {
                    //wenn variable character gleich dem buschtaben an stelle i der revealedWordList liste ist,
                    //dann steze stelle i der liste hiddenWordList auf die variable character.
                    if (character == revealedWordList.get(i)) {
                        hiddenWordList.set(i, character);

                    }
                }
                System.out.println("Yeah weiter so!");
                zeigeSpielfeld(hiddenWordList);
                character = scannerword.next().charAt(0);

            } else if (hiddenWordList.containsAll(revealedWordList)) {
                break;
            } else {
                System.out.println("schade es ist falsch versuche es nochmal!");
                zeigeSpielfeld(hiddenWordList);
                character = scannerword.next().charAt(0);
            }
        }
    }

    static void zeigeSpielfeld(List<Character> hiddenWordList) {
        for (Character c : hiddenWordList) {
            System.out.print(c);
        }
    }

    static List<Character> transformStringToCharacterList(String word){
        List<Character> characterList = new ArrayList<>();
        for(int i = 0; i < word.length() ; i++){
            characterList.add(word.charAt(i));
        }
        return characterList;
    }
}