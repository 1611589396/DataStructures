package com.msb;

import org.junit.Test;

import java.util.Arrays;

public class Code01_SelectionSortTest {

    @Test
    public void selectionSort() {
        int[] arr = {101, 34, 119, 1};
        Code01_SelectionSort.selectionSort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}