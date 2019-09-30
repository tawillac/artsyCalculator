package de.infoteam.twi.artsycalculator.characterart;

import de.infoteam.twi.artsycalculator.characterart.initializer.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CharacterArtDisplayTest {

    @Test
    public void printCharacterArtList() {
        // Dependency injection for System.out.println needed
    }

    @Test
    public void printCharacterArt() {
        // Dependency injection for System.out.println needed
    }

    @Test
    public void combineCharacterArtObjects() {
        List<CharacterArt> artList = new ArrayList<CharacterArt>();
        artList.add(new CharacterArt(new InitializeOne()));
        artList.add(new CharacterArt(new InitializeMinus()));
        CharacterArt combinedArt = CharacterArtDisplay.combineCharacterArtObjects(artList);
        CharacterArt referenceArt = new CharacterArt(new InitializeTestOneMinus());
        assertEquals(referenceArt, combinedArt);
    }

    @Test
    public void createCharacterArtListFromString() {
        String testString = "1+2=3";
        List<CharacterArt> referenceArtList = new ArrayList<>();

        referenceArtList.add(new CharacterArt(new InitializeOne()));
        referenceArtList.add(new CharacterArt(new InitializeSpace()));
        referenceArtList.add(new CharacterArt(new InitializePlus()));
        referenceArtList.add(new CharacterArt(new InitializeSpace()));
        referenceArtList.add(new CharacterArt(new InitializeTwo()));
        referenceArtList.add(new CharacterArt(new InitializeSpace()));
        referenceArtList.add(new CharacterArt(new InitializeEquals()));
        referenceArtList.add(new CharacterArt(new InitializeSpace()));
        referenceArtList.add(new CharacterArt(new InitializeThree()));
        referenceArtList.add(new CharacterArt(new InitializeSpace()));

        List<CharacterArt> actualArtList = CharacterArtDisplay.createCharacterArtListFromString(testString);
        assertEquals(referenceArtList, actualArtList);


    }
}