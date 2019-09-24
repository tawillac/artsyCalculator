package de.infoteam.twi.artsycalculator.characterart;

import de.infoteam.twi.artsycalculator.characterart.initializer.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CharacterArtBuilderTest {

    @Test
    public void getCharacterArt() {
        CharacterArt artOne = CharacterArtBuilder.getCharacterArt("1");
        assertEquals(new CharacterArt(new InitializeOne()), artOne);
    }
}