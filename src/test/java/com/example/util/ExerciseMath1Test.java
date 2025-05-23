package com.example.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseMath1Test {

    @BeforeEach
    void setUp() {
        System.out.println("test begin");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test end");
    }

    @Test
    void testFactorial1(){
        IllegalArgumentException expectedException = assertThrows(
                IllegalArgumentException.class,
                () -> ExerciseMath1.factorial(  -1)
        );
        assertEquals("0以下は不正です",
                expectedException.getMessage(),
                "TC1:期待値と実際の結果が異なります"
        );
    }
    @Test
    void testFactorial2(){
        IllegalArgumentException expectedException = assertThrows(
                IllegalArgumentException.class,
                () -> ExerciseMath1.factorial(  0)
        );
        assertEquals("0以下は不正です",
                expectedException.getMessage(),
                "TC2:期待値と実際の結果が異なります"
        );
    }
    @Test
    void testFactorial3(){
        int actualAnswer = ExerciseMath1.factorial(1);
        assertEquals(1, actualAnswer, "TC3:期待値と実際の結果が異なります");
    }
    @Test
    void testFactorial4(){
        int actualAnswer = ExerciseMath1.factorial(2);
        assertEquals(2, actualAnswer, "TC4:期待値と実際の結果が異なります");
    }
    @Test
    void testFactorial5(){
        int actualAnswer = ExerciseMath1.factorial(3);
        assertEquals(6, actualAnswer, "TC5:期待値と実際の結果が異なります");
    }
    @Test
    void testFactorial6(){
        int actualAnswer = ExerciseMath1.factorial(4);
        assertEquals(24, actualAnswer, "TC6:期待値と実際の結果が異なります");
    }
    @Test
    void testFactorial7(){
        int actualAnswer = ExerciseMath1.factorial(11);
        assertEquals(39916800, actualAnswer, "TC7:期待値と実際の結果が異なります");
    }
    @Test
    void testFactorial8(){
        int actualAnswer = ExerciseMath1.factorial(12);
        assertEquals(479001600, actualAnswer, "TC8:期待値と実際の結果が異なります");
    }

    @Test
    void testFactorial9() {
        IllegalArgumentException expectedException = assertThrows(
                IllegalArgumentException.class,
                () -> ExerciseMath1.factorial(13)
        );
        assertEquals("13以上の値は不正です",
                expectedException.getMessage(),
                "TC9:期待値と実際の結果が異なります"
        );
    }

    @Test
    void testFactorial10() {
        IllegalArgumentException expectedException = assertThrows(
                IllegalArgumentException.class,
                () -> ExerciseMath1.factorial(  14)
        );
        assertEquals("13以上の値は不正です",
                expectedException.getMessage(),
                "TC10:期待値と実際の結果が異なります"
        );
    }


}