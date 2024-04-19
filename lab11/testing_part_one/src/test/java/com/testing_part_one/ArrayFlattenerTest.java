package com.testing_part_one;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.when;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ArrayFlattenerTest {

    ArrayFlattener arrayFlattener;
    // @After
    // arrayFlattener = null;

    @Before
    public void setUp() {
        arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() {
        arrayFlattener = null;
    }

    @Test
    public void testFlattenArrayWithNotNullInput() {

        int[][] input = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
        int[] result = arrayFlattener.flattenArray(input);
        int[] expected = { 1, 3, 0, 4, 5, 9 };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] input = null;
        int[] result = arrayFlattener.flattenArray(input);
        int[] expected = {};
        assertArrayEquals(expected, result);

    }

}
