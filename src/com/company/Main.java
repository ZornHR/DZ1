package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 1};
        tanosSort(arr);

    }

    public static double getMidAr(int[] mass) {
        double sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        double midAr = sum / mass.length;
        return midAr;
    }

    public static int[] tanosSort(int[] mass) {
        System.out.println(Arrays.toString(mass));
        System.out.println(testArr(mass));
        double midAr2 = getMidAr(mass);
        int[] sortedMass = new int[mass.length];
        int min = 0;
        int max = mass.length - 1;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < midAr2) {
                sortedMass[min] = mass[i];
                min++;
            } else {
                sortedMass[max] = mass[i];
                max--;

            }
        }
        int[] left;
        int[] right;


        System.out.println(Arrays.toString(sortedMass));
        System.out.println(testArr(sortedMass));
        return sortedMass;
    }

    public static boolean testArr(int[] arr2) {
        boolean isSorted = true;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;


    }
}
