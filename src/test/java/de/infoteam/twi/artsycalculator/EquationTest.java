package de.infoteam.twi.artsycalculator;

        import de.infoteam.twi.artsycalculator.equation.Equation;
        import de.infoteam.twi.artsycalculator.equation.EquationParser;
        import de.infoteam.twi.artsycalculator.exception.EquationException;
        import org.junit.Test;

        import static junit.framework.TestCase.*;

public class EquationTest {

    @Test
    public void printEquation() {
        try
        {
            Equation equation = new EquationParser(new String[]{"13", "+", "11"}).createEquation();
            assertEquals("13+11=24", equation.printEquation());
        }
        catch (EquationException equationEx) {
            fail();
        }
    }

    @Test
    public void operator_plus_calculate() {
        Integer result = Equation.Operator.PLUS.calculate(15, 8);
        assertEquals(Integer.valueOf(23), result);
    }

    @Test
    public void operator_minus_calculate() {
        Integer result = Equation.Operator.MINUS.calculate(21,12);
        assertEquals(Integer.valueOf(9), result);
    }

    @Test
    public void equation_calculate() {
        try {
            Equation equation = new  EquationParser(new String[]{"1", "+", "2", "-", "7", "+", "10"}).createEquation();
            assertEquals(Integer.valueOf(6), equation.getResult());
        } catch (EquationException e) {
           fail();
        }

    }

}