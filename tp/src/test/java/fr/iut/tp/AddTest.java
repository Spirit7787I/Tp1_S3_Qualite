package fr.iut.tp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Testadd {

    @Test
    public void somme(){
        Add add = new Add();

        int res = add.add(2, 3);
        assertEquals(5, res);
    }


}
