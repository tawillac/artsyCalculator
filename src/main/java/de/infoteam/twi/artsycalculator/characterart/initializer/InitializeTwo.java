package de.infoteam.twi.artsycalculator.characterart.initializer;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;

public class InitializeTwo implements CharacterArtInitializer {
    private Integer width = 4;
    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public CharacterArt initializeCharacter(CharacterArt characterArt) {
        // First Row
        characterArt.setPosition(0,0,true);
        characterArt.setPosition(0,1,true);
        characterArt.setPosition(0,2,true);
        characterArt.setPosition(0,3,true);

        // Second Row
        characterArt.setPosition(1,3,true);

        // Third Row
        characterArt.setPosition(2,3,true);
        characterArt.setPosition(2,2,true);
        characterArt.setPosition(2,1,true);
        characterArt.setPosition(2,0,true);

        // Fourth Row
        characterArt.setPosition(3,0,true);

        // Fifth Row
        characterArt.setPosition(4,0,true);
        characterArt.setPosition(4,1,true);
        characterArt.setPosition(4,2,true);
        characterArt.setPosition(4,3,true);
        return characterArt;
    }
}
