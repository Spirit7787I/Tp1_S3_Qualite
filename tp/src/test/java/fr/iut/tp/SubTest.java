package fr.iut.tp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {

    @Test
    public void testSub() {
        Sub sub = new Sub();

        assertEquals(2, sub.sub(5, 3));
    }
}
