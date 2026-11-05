package fr.iut.tp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class cacaTest {

    @Test
    public void testSubtraction() {
        Sub sub = new Sub();
        int result = sub.sub(10, 5);
        assertTrue(result == 5, "Expected 10 - 5 to equal 5");
    }
}