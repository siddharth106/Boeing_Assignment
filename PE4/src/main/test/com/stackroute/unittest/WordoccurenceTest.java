package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordoccurenceTest {

    @Test
    public void occurence() {
        assertEquals(3, Wordoccurence.occurence("secddrecddeecd","ecd"));
        assertEquals(2, Wordoccurence.occurence("secevggevggdevggd","evggd"));
    }
}