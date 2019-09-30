package de.infoteam.twi.artsycalculator.equation;

import de.infoteam.twi.artsycalculator.exception.EquationException;

import java.util.ArrayList;
import java.util.List;

public class EquationParser {

    Integer firstNumber;
    List<Equation.OperatorNumberTuple> tupleList;
    String[] args;

    public EquationParser(String[] args) {
        this.firstNumber = null;
        this.tupleList = new ArrayList<>();
        this.args = args;
    }

    public Equation createEquation() throws EquationException {
        parse();
        return new Equation(firstNumber, tupleList);

    }

    void parse() throws EquationException {

        // Check if first equation item is a number
        if (!isNumber(args[0])) {
            throw new EquationException("First item is not a number");
        }
        firstNumber = Integer.parseInt(args[0]);

        // Check if other equation items are tuples of operator and number and create tuple objects, if they are
        for (int i = 1; i < args.length; i++) {
            if (Equation.Operator.isOperator(args[i]) && isNumber(args[i+1])) {
                tupleList.add(new Equation.OperatorNumberTuple(Equation.Operator.fromString(args[i]), Integer.parseInt(args[i+1])));
                i++;
            } else {
                throw new EquationException("Invalid tuple");
            }
        }
    }

    public Boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
