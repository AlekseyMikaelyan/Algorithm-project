package org.example.algorithmproject.algorithmutil.util;

public class ShuttleSort {
    public static void shuttleSort(int [] array) {
        for(int i = 1; i < array.length; i++) {
            if(array[i] < array[i-1]) {
                swap(array, i, i -1);
            }
            for(int j = i - 1; (j -1) >= 0; j--) {
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int [] array, int firstNumber, int secondNumber) {
        int temp = array[firstNumber];
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = temp;
    }
}
