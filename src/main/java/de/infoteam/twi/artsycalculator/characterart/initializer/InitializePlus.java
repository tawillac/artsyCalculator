package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

public class InitializePlus implements CharacterArtInitializer {
    private Integer width = 3;

    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public CharacterArt initializeCharacter(CharacterArt characterArt) {
        // Second Row
        characterArt.setPosition(1,1,true);

        // Third Row
        characterArt.setPosition(2,0,true);
        characterArt.setPosition(2,1,true);
        characterArt.setPosition(2,2,true);

        // Fourth Row
        characterArt.setPosition(3,1,true);

        return characterArt;
    }
}
