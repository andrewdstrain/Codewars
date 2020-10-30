package com.isageek.blaztek.codewars.removeStringSpaces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Remove All Spaces")
class KataTest {
    @Test
    void example1() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }

    @Test
    void example2() {
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
    }

    @Test
    void example3() {
        assertEquals("8aaaaaddddr", Kata.noSpace("8aaaaa dddd r     "));
    }

    @Test
    void example4() {
        assertEquals("jfBmgklf8hg88lbe8", Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
    }

    @Test
    void example5() {
        assertEquals("jfBmgklf8hg88lbe8", Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
    }
}
