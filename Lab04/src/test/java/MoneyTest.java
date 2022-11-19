import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MoneyTest {
    @Test
    public void testMultiplication()
    {
        Franc five = new Franc(5);
        Franc product = five.times(4);
        assertEquals(20, product.getAmount());

        assertEquals(new Franc(10), new Franc(10));
    }

    @Test
    public void testEquality()
    {
        assertEquals(new Dollar(10), new Dollar(10));
        assertEquals(new Dollar(10), new Dollar(10));
        assertEquals(new Dollar(10), new Dollar(10));

        assertTrue(new Dollar(10).equals(new Dollar(10)));
//        assertFalse(new Dollar(10).equals(new Dollar(10)));
    }
}
