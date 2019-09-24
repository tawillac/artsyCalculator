package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

public class InitializeNone implements CharacterArtInitializer {

    private Integer width = 5;

    @Override
    public CharacterArt initializeCharacter(CharacterArt characterArt) {
        // First Row
        characterArt.setPosition(0,0,true);
        characterArt.setPosition(0,4,true);

        // Second Row
        characterArt.setPosition(1,1,true);
        characterArt.setPosition(1,3,true);

        // Third Row
        characterArt.setPosition(2,2,true);

        // Fourth Row
        characterArt.setPosition(3,1,true);
        characterArt.setPosition(3,3,true);

        // Fifth Row
        characterArt.setPosition(4,0,true);
        characterArt.setPosition(4,4,true);
        return characterArt;
    }

    @Override
    public Integer getWidth() {
        return width;
    }
}
