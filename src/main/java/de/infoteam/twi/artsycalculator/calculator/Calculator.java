package de.infoteam.twi.artsycalculator.calculator;

import de.infoteam.twi.artsycalculator.characterart.CharacterArt;
import de.infoteam.twi.artsycalculator.characterart.CharacterArtDisplay;
import de.infoteam.twi.artsycalculator.equation.Equation;
import de.infoteam.twi.artsycalculator.equation.EquationParser;
import de.infoteam.twi.artsycalculator.exception.EquationException;

import java.util.List;

public class Calculator {

    public static void main(String[] args)  {
        try {
            Equation equation = new EquationParser(args).createEquation();
            String equationAsText = equation.printEquation();
            System.out.println(equationAsText);
            List<CharacterArt> characterArtList = CharacterArtDisplay.createCharacterArtListFromString(equationAsText);
            CharacterArtDisplay.printCharacterArtList(characterArtList);
        }
        catch (EquationException eqEx) {
            System.err.println(eqEx.getMessage());
        }



    }


}
