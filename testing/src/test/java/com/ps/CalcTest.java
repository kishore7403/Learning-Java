package com.ps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    void givenAZeroDividedByZeroReturnFalse(){
        boolean res = new Calc().divide(0, 0);
        System.out.println("res: "+ res);
        assertFalse(res );
    }
    @Test
    void givenAZeroDividedByPositiveReturnTrue(){
        boolean res = new Calc().divide(0, 5);
        System.out.println("res: "+ res);
        assertTrue(res);
    }
    @Test
    void givenAZeroDividedByNegativeReturnTrue(){
        boolean res = new Calc().divide(0, -5);
        System.out.println("res: "+ res);
        assertTrue(res);
    }

    @Test
    void givenAPositiveDividedbyZeroReturnsFalse(){
        boolean res = new Calc().divide(5, 0);
        System.out.println("res: "+ res);
        assertFalse(res);
    }

    @Test
    void givenAPositveDividedbyPositiveDReturnTrue(){
        boolean res = new Calc().divide(10, 5);
        System.out.println("res: "+ res);
        assertTrue(res);
    }
}