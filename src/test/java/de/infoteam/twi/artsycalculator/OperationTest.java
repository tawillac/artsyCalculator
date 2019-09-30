package de.infoteam.twi.artsycalculator;

        import de.infoteam.twi.artsycalculator.equation.Equation;
        import org.junit.Test;

        import static junit.framework.TestCase.*;

public class OperationTest {

    @Test
    public void testToStringWithRealValues() {
        /*
        Equation operation = new Equation(13, Equation.Operator.PLUS, 11);
        assertEquals("13+11=24", operation.toString());


         */
    }

    @Test
    public void isValidOperation_invalidArguments_false() {
        /*

        String[] argsInvalid = new String[]{"1", "4", "11"};
        Boolean testWithInvalidArguments = Equation.isValidOperation(argsInvalid);

        assertFalse(testWithInvalidArguments);

         */
    }


    @Test
    public void isValidOperation_validArguments_true() {
        /*
        String[] argsValid = new String[]{"13", "1-", "11"};
        Boolean testWithValidArguments = Equation.isValidOperation(argsValid);

        assertTrue(testWithValidArguments);
         */


    }

}