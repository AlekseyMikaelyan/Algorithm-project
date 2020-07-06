package org.example.algorithmproject.algorithmutil.service;

import org.example.algorithmproject.algorithmutil.util.*;

import java.util.Collections;
import java.util.List;

public class TimeCounter {
    public static long bubbleSortTimeCounter(int[] array) {
        long start = System.nanoTime();
        BubbleSort.bubbleSort(array);
        long end = System.nanoTime();

        return end - start;
    }

    public static long selectionSortTimeCounter(int[] array) {
        long start = System.nanoTime();
        SelectionSort.selectionSort(array);
        long end = System.nanoTime();

        return end - start;
    }

    public static long insertionSortTimeCounter(int[] array) {
        long start = System.nanoTime();
        InsertionSort.insertionSort(array);
        long end = System.nanoTime();

        return end - start;
    }

    public static long shuttleSortTimeCounter(int[] array) {
        long start = System.nanoTime();
        ShuttleSort.shuttleSort(array);
        long end = System.nanoTime();

        return end - start;
    }

    public static long shellSortTimeCounter(int[] array) {
        long start = System.nanoTime();
        ShellSort.shellSort(array);
        long end = System.nanoTime();

        return end - start;
    }

    public static long mergeSortTimeCounter(int[] array) {
        long start = System.nanoTime();
        MergeSort.mergeSort(array, 0, array.length-1);
        long end = System.nanoTime();

        return end - start;
    }

    public static long quickSortTimeCounter(int[] array) {
        long start = System.nanoTime();
        QuickSort.quickSort(array, 0, array.length - 1);
        long end = System.nanoTime();

        return end - start;
    }

    public static long collectionsSortTimeCounter(List<Integer> list) {
        long start = System.nanoTime();
        Collections.sort(list);
        long end = System.nanoTime();

        return end - start;
    }
}
