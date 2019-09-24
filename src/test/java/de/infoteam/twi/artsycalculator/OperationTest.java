package de.infoteam.twi.artsycalculator;

        import de.infoteam.twi.artsycalculator.operation.Operation;
        import org.junit.Test;

        import static junit.framework.TestCase.*;

public class OperationTest {

    @Test
    public void testToStringWithRealValues() {
        Operation operation = new Operation(13, Operation.Operator.PLUS, 11);
        assertEquals("13+11=24", operation.toString());
    }

    @Test
    public void isValidOperation() {
        String[] argsValid = new String[]{"13", "-", "11"};
        Boolean testWithValidArguments = Operation.isValidOperation(argsValid);
        String[] argsInvalid = new String[]{"1", "4", "11"};
        Boolean testWithInvalidArguments = Operation.isValidOperation(argsInvalid);
        assertTrue(testWithValidArguments);
        assertFalse(testWithInvalidArguments);

    }

}