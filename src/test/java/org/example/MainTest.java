package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @BeforeEach
    void setUp() {
        System.out.println("-------- @BeforeEach---------");
    }

    @Test
    void truncate()
    {
        assertEquals("CD", Main.truncate("AACD"));
        assertEquals("CD", Main.truncate("ACD"));
        assertEquals("CDEF", Main.truncate("CDEF"));
        assertEquals("CDAA", Main.truncate("CDAA"));
    }

    @Test
    void firstOneSameOfLastOne()
    {
        assertTrue(Main.firstOneSameOfLastOne("AB"));
        System.out.println("good");
        assertFalse(Main.firstOneSameOfLastOne("A"));
        System.out.println("good");
        assertTrue(Main.firstOneSameOfLastOne("AAFBAA"));
        System.out.println("good");
        assertFalse(Main.firstOneSameOfLastOne("ABCD"));
        System.out.println("good");
    }

    @Test
    void ArraysEquals()
    {
        int[] actual  = {22,10,25,63,42,48,1,98};
        int[] expected = {1,10,22,25,42,48,63,98};
        Arrays.sort(actual);
        assertArrayEquals(expected,actual);
    }

    @Test
    void timeOutOfSort()
    {
        SortTesting sortTesting = new SortTesting();
        assertTimeout(ofSeconds(1), () -> {
            sortTesting.generateRandomArray();
            sortTesting.bubbleSort();
            // sortTesting.selectionSort();
        });
    }

    @AfterEach
    void tearDown() {
        System.out.println("-------- @AfterEach---------");
    }
}