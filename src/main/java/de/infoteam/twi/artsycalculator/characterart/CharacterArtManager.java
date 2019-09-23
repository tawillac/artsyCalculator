package de.infoteam.twi.artsycalculator.characterart;

import java.util.ArrayList;
import java.util.List;

public class CharacterArtManager {

    private CharacterArt getStringAsCharacterArt(String input) {
        switch(input) {
            case "1":
                return CharacterArtBuilder.getOneAsCharart();
            case "2":
                return CharacterArtBuilder.getTwoAsCharart();
            case "3":
                return CharacterArtBuilder.getThreeAsCharart();
            case "4":
                return CharacterArtBuilder.getFourAsCharart();
            case " ":
                return CharacterArtBuilder.getSpaceAsCharart();
            case "+":
                return CharacterArtBuilder.getPlusAsCharart();
            case "=":
                return CharacterArtBuilder.getEqualsAsCharart();
            default:
                return CharacterArtBuilder.getNoneAsCharart();
        }
    }

    public List<CharacterArt> createCharacterArtListFromArgs(String[] args) {
        List<CharacterArt> characterArtList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                characterArtList.add(getStringAsCharacterArt(args[i]));
            } else {
                characterArtList.add(getStringAsCharacterArt(" "));
                characterArtList.add(getStringAsCharacterArt("+"));
                characterArtList.add(getStringAsCharacterArt(" "));
                characterArtList.add(getStringAsCharacterArt(args[i]));
            }
        }
        characterArtList.add(getStringAsCharacterArt(" "));
        characterArtList.add(getStringAsCharacterArt("="));
        characterArtList.add(getStringAsCharacterArt(" "));
        characterArtList.add(getStringAsCharacterArt(sum(args).toString()));
        return characterArtList;

    }

    private Integer sum(String[] args) {
        Integer result = 0;
        for (String arg : args) {
            Integer number = Integer.parseInt(arg);
            result += number;
        }
        return result;
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
        CharacterArt newArt = new CharacterArt(combinedArea);
        return newArt;
    }
}
