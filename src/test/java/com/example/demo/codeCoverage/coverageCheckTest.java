package com.example.demo.codeCoverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coverageCheckTest {

    @Test
    void isStringLong() {

        boolean result = coverageCheck.IsStringLong("abc");
        assertEquals(false, result);
    }
}