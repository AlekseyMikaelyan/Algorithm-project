package org.example.algorithmproject.algorithmutil.util;

public class ShellSort {
    public static void shellSort(int [] array) {
        int half = array.length / 2;
        while(half > 0) {
            for(int i = 0; i < array.length; i++) {
                for(int j = i - half; j >= 0; j -= half) {
                    if(array[j] > array[j+half]) {
                        int temp = array[j];
                        array[j] = array[j+half];
                        array[j+half] = temp;
                    }
                }
            }
            half = half / 2;
        }
    }
}
