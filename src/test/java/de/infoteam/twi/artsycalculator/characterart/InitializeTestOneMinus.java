package de.infoteam.twi.artsycalculator.characterart;

import de.infoteam.twi.artsycalculator.characterart.initializer.CharacterArtInitializer;

public class InitializeTestOneMinus implements CharacterArtInitializer {
    private Integer width = 5;
    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public CharacterArt initializeCharacter(CharacterArt characterArt) {
        // First Row
        characterArt.setPosition(0,1,true);

        // Second Row
        characterArt.setPosition(1,0,true);
        characterArt.setPosition(1,1,true);

        // Third Row
        characterArt.setPosition(2,1,true);
        characterArt.setPosition(2,2,true);
        characterArt.setPosition(2,3,true);
        characterArt.setPosition(2,4,true);

        // Fourth Row
        characterArt.setPosition(3,1,true);

        // Fifth Row
        characterArt.setPosition(4,1,true);
        return characterArt;
    }
}
