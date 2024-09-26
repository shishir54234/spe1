import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        double result = Main.squareRoot(16);
        Assert.assertEquals(4.0, result, 0.001);
    }

    @Test
    public void testFactorial() {
        long result = Main.factorial(5);
        Assert.assertEquals(120, result);
    }

    @Test
    public void testNaturalLog() {
        double result = Main.naturalLog(Math.E);
        Assert.assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testPower() {
        double result = Main.power(2, 3);
        Assert.assertEquals(8.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorial() {
        Main.factorial(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNaturalLog() {
        Main.naturalLog(-5);
    }
}