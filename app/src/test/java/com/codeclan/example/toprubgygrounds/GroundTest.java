package com.codeclan.example.toprubgygrounds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/05/2017.
 */

public class GroundTest {

    Ground ground;

    @Before
    public void before() {
        ground = new Ground(1, "FNB Stadium", 94_736);
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, ground.getRanking());
    }

    @Test
    public void getNameTest() {
        assertEquals("FNB Stadium", ground.getName());
    }

    @Test
    public void getCapacityTest() {
        assertEquals((Integer)94_736, ground.getCapacity());
    }
}