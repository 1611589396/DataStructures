package com.atguigu.sort;

import org.junit.Test;

import java.util.Arrays;

public class SelectSortTest {
    @Test
    public void selectSort() {
        int arr[] = {101, 34, 119, 1};
        SelectSort.selectSort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
    @Test
    public void swap() {
        int[] a = {5,6};
        System.out.println(a[0]);
        System.out.println(a[1]);
        swap(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        swap1(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
    /**
     * Java交换两个数字:https://www.cnblogs.com/zhihaospace/p/12217633.html
     * java中两个变量，值的交换问题:https://blog.csdn.net/qq_42647047/article/details/117202134
     * @param a
     */
    public static void swap(int[] a) {
        int tmp = a[0];
        a[0] = a[1];
        a[1] = tmp;
    }
    public static void swap1(int[] a) {
        int tmp = a[1];
        a[1] = a[0];
        a[0] = tmp;
    }
}