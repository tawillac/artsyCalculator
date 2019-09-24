package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

public class InitializeMinus implements CharacterArtInitializer {
    private Integer width = 3;

    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public CharacterArt initializeCharacter(CharacterArt characterArt) {

        // Third Row
        characterArt.setPosition(2,0,true);
        characterArt.setPosition(2,1,true);
        characterArt.setPosition(2,2,true);

        return characterArt;
    }
}
