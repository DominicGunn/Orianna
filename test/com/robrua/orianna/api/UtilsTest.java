package com.robrua.orianna.api;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Dominic Gunn (Dominic.Gunn@protonmail.ch)
 */
public class UtilsTest {

    private static final String SUMMONER_IDS_STRING = "1,2,3,4,5,6,7,8,9,10";
    private static final List<Integer> SUMMONER_ID_LIST = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Test
    public void testBreakUpList() throws Exception {
        int index = 0;
        List<List<Integer>> splitList = Utils.breakUpList(SUMMONER_ID_LIST, 2);

        assertEquals(5, splitList.size());
        for (int i = 1; i < 10; i += 2) {
            assertEquals(Arrays.asList(i, i + 1), splitList.get(index++));
        }
    }

    @Test
    public void testGetIdString() throws Exception {
        assertEquals(SUMMONER_IDS_STRING, Utils.getIDString(SUMMONER_ID_LIST));
    }
}
