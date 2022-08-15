package com.msb;

/**
 * 时间复杂度；
 * 在N一样的情况下，拼常数，运行即可
 */
public class Test {

    public static void process1() {
        int N = 1000;
        int a = 0;
        for (int i = 0; i < N; i++) {
            a = 2 + 5;
            a = 4 * 7;
            a = 6 * 8;
        }
    }

    public static void process2() {
        int N = 1000;
        int a = 0;
        a = 3 | 6;
        a = 3 & 4;
        a = 4 ^ 785;

    }

    public static void main(String[] args) {

    }
}
