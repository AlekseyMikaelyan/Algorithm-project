package org.example.algorithmproject.algorithmutil.util;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array, int low, int high) {

        if (high <= low)
            return;

        int middle = low + (high - low) / 2;

        mergeSort(array, low, middle);
        mergeSort(array, middle + 1, high);

        int[] buf = Arrays.copyOf(array, array.length);

        for (int k = low; k <= high; k++)
            buf[k] = array[k];

        int i = low, j = middle + 1;
        for (int k = low; k <= high; k++) {

            if (i > middle) {
                array[k] = buf[j];
                j++;
            } else if (j > high) {
                array[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                array[k] = buf[j];
                j++;
            } else {
                array[k] = buf[i];
                i++;
            }
        }
    }

}
