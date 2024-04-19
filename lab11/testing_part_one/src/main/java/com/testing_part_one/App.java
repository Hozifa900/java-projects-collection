package com.testing_part_one;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayReverser arrayReverser = new ArrayReverser();
        int[][] input = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
        for (int is : arrayReverser.reverseArray(input)) {
            System.out.println(is);
        }

    }
}
