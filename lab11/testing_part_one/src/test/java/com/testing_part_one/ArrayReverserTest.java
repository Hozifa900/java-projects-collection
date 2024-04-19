package com.testing_part_one;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ArrayReverserTest {
    private ArrayFlattener arrayFlattener;
    private ArrayReverser arrayReverser;

    @Before
    public void setUp() {
        arrayFlattener = Mockito.mock(ArrayFlattener.class);
        arrayReverser = new ArrayReverser();
    }

    @After
    public void tearDown() {
        arrayFlattener = null;
        arrayReverser = null;

    }

    @Test
    public void testReverseArrayWithNotNullInput() {

        int[][] input = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
        int[] flattenedArray = { 1, 3, 0, 4, 5, 9 };
        when(arrayFlattener.flattenArray(input)).thenReturn(flattenedArray);

        int[] expected = { 9, 5, 4, 0, 3, 1 };

        int[] result = arrayReverser.reverseArray(input);
        assertArrayEquals(expected, result);
        // Mockito.verify(arrayFlattener).flattenArray(input);

    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] input = null;
        int[] flattenededArray = {};
        when(arrayFlattener.flattenArray(input)).thenReturn(flattenededArray);

        int[] result = arrayReverser.reverseArray(input);
        int[] expected = {};
        assertArrayEquals(expected, result);
        // Mockito.verify(arrayFlattener).flattenArray(null);

    }

}
