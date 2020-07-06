package org.example.algorithmproject.algorithmutil.util;

public class BubbleSort {
    public static void bubbleSort(int [] array) {
        int count;
        do {
            count = 0;
            for(int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    count++;
                }
            }
        } while(count > 0);
    }
}
