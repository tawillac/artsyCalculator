package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

import java.util.List;

public interface CharacterArtInitializer {

    final Integer height = 5;

    default Integer getHeight() {
        return height;
    };
    Integer getWidth();
    CharacterArt initializeCharacter(CharacterArt characterArt);
}
