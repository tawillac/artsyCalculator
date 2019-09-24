package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

public class InitializeSpace implements CharacterArtInitializer {
    private Integer width = 2;
    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public CharacterArt initializeCharacter(CharacterArt characterArt) {
        return characterArt;
    }
}
