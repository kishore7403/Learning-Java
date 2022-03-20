package com.ps.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {
    @ParameterizedTest
    @EmptySource
    void givenEmptyStringReturnTheSame(String s) {
        String res = new Problem1().replacer(s, "aa", "$$$");
        assertTrue(res.equals(""));
    }
    @ParameterizedTest
    @ValueSource(strings = {"xyz"," ","abc","  "})
    void givenBlankStringReturnTheSame(String s){
        String res= new Problem1().replacer(s,"aa","$$$");
        assertTrue(res.equals(s));
    }
    @ParameterizedTest
    @NullSource
    void givenNullReturnNull(String s){
        String res= new Problem1().replacer(s,"aa","$$$");
        assertEquals(null, res);
    }

    @Test
    void givenValidStringReturnReplaced(){
        String res= new Problem1().replacer("aaaaabcaa","aa","$$$");
        assertTrue(res.equals("$$$$$$abc$$$"));
    }



}