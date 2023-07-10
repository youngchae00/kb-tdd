package my.kb.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testFranMultiplication() {
        Fran five = new Fran(5);
        assertEquals(new Fran(10), five.times(2));
        assertEquals(new Fran(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Fran(5).equals(new Fran(5)));
        assertFalse(new Fran(5).equals(new Fran(6)));
    }

}
