package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @AfterEach
    void tearDown() {
        System.out.println("-------- @AfterEach---------");
    }
}