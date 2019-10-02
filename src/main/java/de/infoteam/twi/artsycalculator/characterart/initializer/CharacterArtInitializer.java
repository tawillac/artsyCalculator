package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

public interface CharacterArtInitializer {

    final Integer HEIGHT = 5;

    default Integer getHeight() {
        return HEIGHT;
    }
    Integer getWidth();
    CharacterArt initializeCharacter(CharacterArt characterArt);
}
