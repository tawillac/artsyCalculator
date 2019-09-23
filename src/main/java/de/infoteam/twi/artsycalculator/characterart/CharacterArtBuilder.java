package de.infoteam.twi.artsycalculator.characterart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterArtBuilder {

    private static final int HEIGHT = 5;


    public static CharacterArt getNoneAsCharart() {
        CharacterArt charArtNone = new CharacterArt(HEIGHT,0);
        return charArtNone;
    }

    public static CharacterArt getEqualsAsCharart() {
        CharacterArt charArtEquals = new CharacterArt(HEIGHT, 3);

        // Second Row
        charArtEquals.setPosition(1,0,true);
        charArtEquals.setPosition(1,1,true);
        charArtEquals.setPosition(1,2,true);

        // Fourth Row
        charArtEquals.setPosition(3,0,true);
        charArtEquals.setPosition(3,1,true);
        charArtEquals.setPosition(3,2,true);

        return charArtEquals;
    }

    public static CharacterArt getSpaceAsCharart() {
        CharacterArt charArtSpace = new CharacterArt(HEIGHT, 2);
        return charArtSpace;
    }

    public static CharacterArt getPlusAsCharart() {
        CharacterArt charArtPlus = new CharacterArt(HEIGHT, 3);
        // Second Row
        charArtPlus.setPosition(1,1,true);

        // Third Row
        charArtPlus.setPosition(2,0,true);
        charArtPlus.setPosition(2,1,true);
        charArtPlus.setPosition(2,2,true);

        // Fourth Row
        charArtPlus.setPosition(3,1,true);

        return charArtPlus;
    }

    public static CharacterArt getOneAsCharart() {
        CharacterArt charArtOne = new CharacterArt(HEIGHT, 2);
        // First Row
        charArtOne.setPosition(0,1,true);

        // Second Row
        charArtOne.setPosition(1,0,true);
        charArtOne.setPosition(1,1,true);

        // Third Row
        charArtOne.setPosition(2,1,true);

        // Fourth Row
        charArtOne.setPosition(3,1,true);

        // Fifth Row
        charArtOne.setPosition(4,1,true);
        return charArtOne;
    }

    public static CharacterArt getTwoAsCharart() {
        CharacterArt charArtTwo = new CharacterArt(HEIGHT, 4);
        // First Row
        charArtTwo.setPosition(0,0,true);
        charArtTwo.setPosition(0,1,true);
        charArtTwo.setPosition(0,2,true);
        charArtTwo.setPosition(0,3,true);

        // Second Row
        charArtTwo.setPosition(1,3,true);

        // Third Row
        charArtTwo.setPosition(2,3,true);
        charArtTwo.setPosition(2,2,true);
        charArtTwo.setPosition(2,1,true);
        charArtTwo.setPosition(2,0,true);

        // Fourth Row
        charArtTwo.setPosition(3,0,true);

        // Fifth Row
        charArtTwo.setPosition(4,0,true);
        charArtTwo.setPosition(4,1,true);
        charArtTwo.setPosition(4,2,true);
        charArtTwo.setPosition(4,3,true);
        return charArtTwo;
    }

    public static CharacterArt getThreeAsCharart() {
        CharacterArt charArtThree = new CharacterArt(HEIGHT, 4);
        // First Row
        charArtThree.setPosition(0,0,true);
        charArtThree.setPosition(0,1,true);
        charArtThree.setPosition(0,2,true);
        charArtThree.setPosition(0,3,true);

        // Second Row
        charArtThree.setPosition(1,3,true);

        // Third Row
        charArtThree.setPosition(2,3,true);
        charArtThree.setPosition(2,2,true);
        charArtThree.setPosition(2,1,true);

        // Fourth Row
        charArtThree.setPosition(3,3,true);

        // Fifth Row
        charArtThree.setPosition(4,0,true);
        charArtThree.setPosition(4,1,true);
        charArtThree.setPosition(4,2,true);
        charArtThree.setPosition(4,3,true);
        return charArtThree;
    }

    public static CharacterArt getFourAsCharart() {
        CharacterArt charArtFour = new CharacterArt(HEIGHT, 4);
        // First Row
        charArtFour.setPosition(0,2,true);

        // Second Row
        charArtFour.setPosition(1,1,true);

        // Third Row
        charArtFour.setPosition(2,0,true);

        // Fourth Row
        charArtFour.setPosition(3,0,true);
        charArtFour.setPosition(3,1,true);
        charArtFour.setPosition(3,2,true);
        charArtFour.setPosition(3,3,true);

        // Fifth Row
        charArtFour.setPosition(4,2,true);
        return charArtFour;
    }


}
