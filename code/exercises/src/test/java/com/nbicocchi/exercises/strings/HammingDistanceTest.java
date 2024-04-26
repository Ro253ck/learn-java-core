package com.nbicocchi.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingDistanceTest {

    @Test
    void hammingDistance() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> HammingDistance.hammingDistance("", "nicola"));
        assertThrows(IllegalArgumentException.class, () -> HammingDistance.hammingDistance("nicola", ""));
        assertEquals(1, HammingDistance.hammingDistance("nicola", "n1cola"));
        assertEquals(6, HammingDistance.hammingDistance("nicola", "zzzzzz"));
        assertEquals(0, HammingDistance.hammingDistance("nicola", "nicola"));
    }
}