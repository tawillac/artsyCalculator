package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

public class InitializeFour implements CharacterArtInitializer {

    private Integer width = 4;
    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public CharacterArt initializeCharacter(CharacterArt characterArt) {
        // First Row
        characterArt.setPosition(0,2,true);

        // Second Row
        characterArt.setPosition(1,1,true);

        // Third Row
        characterArt.setPosition(2,0,true);

        // Fourth Row
        characterArt.setPosition(3,0,true);
        characterArt.setPosition(3,1,true);
        characterArt.setPosition(3,2,true);
        characterArt.setPosition(3,3,true);

        // Fifth Row
        characterArt.setPosition(4,2,true);
        return characterArt;
    }
}
