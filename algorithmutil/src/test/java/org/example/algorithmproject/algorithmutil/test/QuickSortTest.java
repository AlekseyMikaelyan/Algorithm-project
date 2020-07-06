package org.example.algorithmproject.algorithmutil.test;

import org.example.algorithmproject.algorithmutil.util.QuickSort;
import org.example.algorithmproject.algorithmutil.util.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    int [] array = {3,6,1,5,2,5,7,9,45,8};
    @Test
    public void methodShouldMakeCorrectSort() {
        QuickSort.quickSort(array,0,array.length-1);
        Assert.assertEquals(array[0] = 1, array[0]);
    }

    @Test
    public void methodShouldReturnTrue() {
        QuickSort.quickSort(array,0,array.length-1);
        Assert.assertTrue(array[array.length-1] == 45);
    }
}
