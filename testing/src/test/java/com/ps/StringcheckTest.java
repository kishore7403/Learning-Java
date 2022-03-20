package com.ps;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringcheckTest {
    static Stringcheck sc;
//    @BeforeAll
//    static void setup(){
//        System.out.println("before all");
//        sc=new Stringcheck();
//    }
    @AfterEach
    void afterEach(){
        System.out.println("hi");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("bye");
    }
    @BeforeEach
    void setSc(){
        System.out.println("before each");
        sc=new Stringcheck();
    }

    @ParameterizedTest
    @NullSource
    void givenNullThenReturnFalse(String s){
        System.out.println(s);
        boolean res=sc.isStartWithCharA(s);
        assertFalse(res);
    }


    @ParameterizedTest
    @EmptySource
    void givenEmptyStringThenReturnFalse(String s){
        System.out.println(s);
        boolean res=sc.isStartWithCharA(s);
        assertFalse(res);
    }

    @Disabled
    void givenBlankStringThenReturnFalse(){
        boolean res=sc.isStartWithCharA("   ");
        assertFalse(res);
    }

//    @Test
//    void givenStringNotStartingWithAReturnFalse(){
//        boolean res=sc.isStartWithCharA("bacd");
//        assertFalse(res);
//    }
    @Test
    void givenStringStartingWithDigitReturnFalse(){
        boolean res=sc.isStartWithCharA("1");
        assertFalse(res);

    }
    @Test
    void givenStringNotStartingWithSpecialCharacterReturnFasle(){
        boolean res=sc.isStartWithCharA("%");
        assertFalse(res);
    }

    @Test
    void givenStringStaringWithAReturnTrue(){
        boolean res=sc.isStartWithCharA("ahbdjb");
        assertTrue(res);
    }

    @ParameterizedTest
    @ValueSource(strings={"xyz","vbd"})
    void givenStringNotStartingWithAReturnFalse(String s){
        System.out.println(s);
        boolean res=sc.isStartWithCharA(s);
        assertFalse(res);

    }


}