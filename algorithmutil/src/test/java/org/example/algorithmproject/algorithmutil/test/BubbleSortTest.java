package org.example.algorithmproject.algorithmutil.test;

import org.example.algorithmproject.algorithmutil.util.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    int [] array = {3,6,1,5,2,5,7,9,45,8};
    @Test
    public void methodShouldMakeCorrectSort() {
        BubbleSort.bubbleSort(array);
        Assert.assertEquals(array[0] = 1, array[0]);
    }

    @Test
    public void methodShouldReturnTrue() {
        BubbleSort.bubbleSort(array);
        Assert.assertTrue(array[array.length-1] == 45);
    }
}
