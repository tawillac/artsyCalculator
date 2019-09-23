package de.infoteam.twi.artsycalculator;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;
import de.infoteam.twi.artsycalculator.characterart.CharacterArtManager;

import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        CharacterArtManager cam = new CharacterArtManager();
        List<CharacterArt> characterArtList = cam.createCharacterArtListFromArgs(args);
        CharacterArt combinedCharacterArts = CharacterArtManager.combineCharacterArtObjects(characterArtList);
        CharacterArtManager.printCharacterArt(combinedCharacterArts);

    }

}
