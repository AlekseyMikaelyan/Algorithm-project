package org.example.algorithmproject.algorithmutil.test;

import org.example.algorithmproject.algorithmutil.util.SelectionSort;
import org.example.algorithmproject.algorithmutil.util.ShellSort;
import org.junit.Assert;
import org.junit.Test;

public class ShellSortTest {

    int [] array = {3,6,1,5,2,5,7,9,45,8};
    @Test
    public void methodShouldMakeCorrectSort() {
        ShellSort.shellSort(array);
        Assert.assertEquals(array[0] = 1, array[0]);
    }

    @Test
    public void methodShouldReturnTrue() {
        ShellSort.shellSort(array);
        Assert.assertTrue(array[array.length-1] == 45);
    }
}
