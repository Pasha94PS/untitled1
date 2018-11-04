package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a [] = {19, 2, 44, 56, 16, 78};
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (a[j]<a[j+1]) {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }
}
