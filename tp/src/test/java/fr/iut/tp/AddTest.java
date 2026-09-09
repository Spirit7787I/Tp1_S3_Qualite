package fr.iut.tp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void somme(){
        add add = new add();

        int res = add.add(2, 3);
        assertEquals(5, res);
    }


}
