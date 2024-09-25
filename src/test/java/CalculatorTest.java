import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        double result = Main.calculate(5, 3, '+');
        Assert.assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        double result = Main.calculate(10, 4, '-');
        Assert.assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        double result = Main.calculate(7, 6, '*');
        Assert.assertEquals(42.0, result, 0.001);
    }

    @Test
    public void testDivision() {
        double result = Main.calculate(20, 5, '/');
        Assert.assertEquals(4.0, result, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Main.calculate(10, 0, '/');
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOperator() {
        Main.calculate(10, 5, '^');
    }
}
