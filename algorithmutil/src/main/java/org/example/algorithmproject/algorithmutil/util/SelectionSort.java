package org.example.algorithmproject.algorithmutil.util;

public class SelectionSort {
    public static void selectionSort(int [] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i; j < array.length; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
