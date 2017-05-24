package com.codeclan.example.toprubgygrounds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/05/2017.
 */

public class TopGroundsTest {

    @Test
    public void getListTest() {
        TopGrounds topGrounds = new TopGrounds();
        assertEquals(10, topGrounds.getList().size());
    }
}


