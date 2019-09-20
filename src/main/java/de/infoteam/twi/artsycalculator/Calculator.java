package de.infoteam.twi.artsycalculator;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;
import de.infoteam.twi.artsycalculator.characterart.CharacterArtManager;

import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        String[] arguments = new String[]{"2", "2"};
        CharacterArtManager cam = new CharacterArtManager();
        List<CharacterArt> characterArtList = cam.createCharacterArtListFromArgs(arguments);
        CharacterArt combinedCharacterArts = CharacterArtManager.combineCharacterArtObjects(characterArtList);
        CharacterArtManager.printCharacterArt(combinedCharacterArts);

    }

}
