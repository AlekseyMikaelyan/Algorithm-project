package org.example.algorithmproject.algorithmmain;

import org.apache.log4j.Logger;
import org.example.algorithmproject.algorithmutil.service.TimeCounter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        int [] ints = new int [10000];
        int index = 0;
        for(int i = 0; i < ints.length; i++) {
            index = (int) Math.floor(Math.random() * 10000);
            ints[i] = index;
        }

//        for(int anInt : ints) {
//            System.out.print(anInt + " ");
//        }

        List<Integer> list = new ArrayList<>();
        for (int value : ints) {
            list.add(value);
        }

        long collectionsSort = TimeCounter.collectionsSortTimeCounter(list);
        logger.info("Проведена сортировка листа методом collections.sort(). Время - " + collectionsSort);
        long bubbleSort = TimeCounter.bubbleSortTimeCounter(ints);
        logger.info("Проведена пузырьковая сортировка массива. Время - " + bubbleSort);
        long selectionSort = TimeCounter.selectionSortTimeCounter(ints);
        logger.info("Проведена сортировка массива выбором. Время - " + selectionSort);
        long insertionSort = TimeCounter.insertionSortTimeCounter(ints);
        logger.info("Проведена сортировка массива вставками. Время - " + insertionSort);
        long shellSort = TimeCounter.shellSortTimeCounter(ints);
        logger.info("Проведена сортировка Шелла над массивом. Время - " + shellSort);
        long shuttleSort = TimeCounter.shuttleSortTimeCounter(ints);
        logger.info("Проведена челночная сортировка массива. Время - " + shuttleSort);
        long mergeSort = TimeCounter.mergeSortTimeCounter(ints);
        logger.info("Проведена сортировка массива слиянием. Время - " + mergeSort);
        long quickSort = TimeCounter.quickSortTimeCounter(ints);
        logger.info("Проведена быстрая сортировка массива. Время - " + quickSort);


        System.out.println("Время выполнения пузырьковой сортировки - " + bubbleSort + ", а метода collections.sort() - " + collectionsSort);
        System.out.println("Время выполнения сортировки выбором - " + selectionSort + ", а метода collections.sort() - " + collectionsSort);
        System.out.println("Время выполнения сортировки вставками - " + insertionSort + ", а метода collections.sort() - " + collectionsSort);
        System.out.println("Время выполнения сортировки Шелла - " + shellSort + ", а метода collections.sort() - " + collectionsSort);
        System.out.println("Время выполнения челночной сортировки - " + shuttleSort + ", а метода collections.sort() - " + collectionsSort);
        System.out.println("Время выполнения сортировки слиянием - " + mergeSort + ", а метода collections.sort() - " + collectionsSort);
        System.out.println("Время выполнения быстрой сортировки - " + quickSort + ", а метода collections.sort() - " + collectionsSort);

    }
}
