package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class revwordTest {

    @Test
    public void sort() {
        assertEquals("eh si kcis ro ton",revword.sort("he is sick or not"));
        assertEquals("eh si kci",revword.sort("he is ick"));
    }
}