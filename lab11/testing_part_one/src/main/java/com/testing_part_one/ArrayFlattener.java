package com.testing_part_one;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayFlattener {

    public int[] flattenArray(int[][] arr) {
        if (arr == null)
            return new int[0];
        return Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
    }

}
