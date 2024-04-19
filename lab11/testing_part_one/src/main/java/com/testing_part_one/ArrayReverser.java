package com.testing_part_one;

public class ArrayReverser {

    public int[] reverseArray(int[][] arr) {
        if (arr == null)
            return new int[0];
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[] flattenArray = arrayFlattener.flattenArray(arr);
        for (int i = 0; i < flattenArray.length / 2; i++) {
            int temp = flattenArray[i];
            flattenArray[i] = flattenArray[(flattenArray.length - 1) - i];
            flattenArray[(flattenArray.length - 1) - i] = temp;
        }
        return flattenArray;
    }

}
