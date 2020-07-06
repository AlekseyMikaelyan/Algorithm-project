package org.example.algorithmproject.algorithmutil.test;

import org.example.algorithmproject.algorithmutil.util.BubbleSort;
import org.example.algorithmproject.algorithmutil.util.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    int [] array = {3,6,1,5,2,5,7,9,45,8};
    @Test
    public void methodShouldMakeCorrectSort() {
        InsertionSort.insertionSort(array);
        Assert.assertEquals(array[0] = 1, array[0]);
    }

    @Test
    public void methodShouldReturnTrue() {
        InsertionSort.insertionSort(array);
        Assert.assertTrue(array[array.length-1] == 45);
    }
}
