package org.example.algorithmproject.algorithmutil.test;

import org.example.algorithmproject.algorithmutil.util.MergeSort;
import org.example.algorithmproject.algorithmutil.util.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    int [] array = {3,6,1,5,2,5,7,9,45,8};
    @Test
    public void methodShouldMakeCorrectSort() {
        MergeSort.mergeSort(array,0,array.length-1);
        Assert.assertEquals(1, array[0]);
    }

    @Test
    public void methodShouldReturnTrue() {
        MergeSort.mergeSort(array,0,array.length-1);
        Assert.assertTrue(array[array.length-1] == 45);
    }
}
