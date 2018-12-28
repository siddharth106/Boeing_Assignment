package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class WOrdOccurenceTest {

    @Test
    public void occurence() {
        assertEquals(3,WOrdOccurence.occurence("secddrecddeecd","ecd"));
        assertEquals(2,WOrdOccurence.occurence("secevggevggdevggd","evggd"));
    }
}