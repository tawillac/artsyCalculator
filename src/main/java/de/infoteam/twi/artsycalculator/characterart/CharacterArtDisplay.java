package de.infoteam.twi.artsycalculator.characterart;

import java.util.ArrayList;
import java.util.List;

public class CharacterArtDisplay {

    public static void printCharacterArtList(List<CharacterArt> characterArts) {
        CharacterArt combinedCharacterArts = combineCharacterArtObjects(characterArts);
        printCharacterArt(combinedCharacterArts);
    }

    public static void printCharacterArt(CharacterArt charArt) {
        for (int i = 0; i < charArt.getArea().size(); i++) {
            for (int j = 0; j < charArt.getArea().get(i).size(); j++) {
                if (charArt.getPosition(i, j)) {
                    System.out.print('X');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static CharacterArt combineCharacterArtObjects(List<CharacterArt> characterArts ) {
        List<List<Boolean>> combinedArea = new ArrayList<>();
        for (int i = 0; i < characterArts.get(0).getArea().size(); i++) {
            final int position = i;
            List<Boolean> combinedRow = new ArrayList<Boolean>();
            characterArts.stream().forEach(charArt -> {
                combinedRow.addAll(charArt.getArea().get(position));
            });
            combinedArea.add(combinedRow);
        }
        CharacterArt combinedArt = new CharacterArt(combinedArea);
        return combinedArt;
    }

    public static List<CharacterArt> createCharacterArtListFromString(String string) {
        List<CharacterArt> characterArtList = new ArrayList<>();
        String[] characters = string.split("");
        for (int i = 0; i < characters.length; i++) {
                characterArtList.add(CharacterArtBuilder.getCharacterArt(characters[i]));
                characterArtList.add(CharacterArtBuilder.getCharacterArt(" "));
        }
        return characterArtList;
    }
}
