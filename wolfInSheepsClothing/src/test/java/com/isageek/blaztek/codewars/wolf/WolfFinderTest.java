package com.isageek.blaztek.codewars.wolf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Warn Sheep")
public class WolfFinderTest {
    @Test
    void example1() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!", WolfFinder.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
    }

    @Test
    void example2() {
        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!", WolfFinder.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
    }

    @Test
    void example3() {
        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!", WolfFinder.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
    }

    @Test
    void example4() {
        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!", WolfFinder.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
    }

    @Test
    void example5() {
        assertEquals("Pls go away and stop eating my sheep", WolfFinder.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}
