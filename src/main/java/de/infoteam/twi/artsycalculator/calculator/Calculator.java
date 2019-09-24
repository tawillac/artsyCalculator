package de.infoteam.twi.artsycalculator.calculator;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;
import de.infoteam.twi.artsycalculator.characterart.CharacterArtDisplay;
import de.infoteam.twi.artsycalculator.operation.Operation;

import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        if (Operation.isValidOperation(args)) {
            Operation op = new Operation(args);
            List<CharacterArt> characterArtList = CharacterArtDisplay.createCharacterArtListFromString(op.toString());
            CharacterArtDisplay.printCharacterArtList(characterArtList);
        } else {
            System.err.println("Parameters did not match a valid math operation: NUMBER OPERATOR NUMBER");
        }

    }


}
