package com.zeroten.common.util;

import org.testng.annotations.Test;
import org.testng.Assert;

public class ArrayUtilsTest {

    @Test
    public void testSelectionSrot(){
        Assert.assertEquals(ArrayUtils.selectionSort(new int[]{}),new int[]{});
        Assert.assertEquals(ArrayUtils.selectionSort(new int[]{45}),new int[]{45});
        Assert.assertEquals(ArrayUtils.selectionSort(new int[]{45, 13}),new int[]{13, 45});
        Assert.assertEquals(ArrayUtils.selectionSort(new int[]{45, 23, 56, -2}),new int[]{-2, 23, 45, 56});
    }

    @Test
    public void testInsertionSrot(){
        Assert.assertEquals(ArrayUtils.insertionSort(new int[]{}),new int[]{});
        Assert.assertEquals(ArrayUtils.insertionSort(new int[]{45}),new int[]{45});
        Assert.assertEquals(ArrayUtils.insertionSort(new int[]{45, 13}),new int[]{13, 45});
        Assert.assertEquals(ArrayUtils.insertionSort(new int[]{45, 23, 56, -2}),new int[]{-2, 23, 45, 56});
    }

    @Test
    public void testBubbleSrot(){
        Assert.assertEquals(ArrayUtils.bubbleSort(new int[]{}),new int[]{});
        Assert.assertEquals(ArrayUtils.bubbleSort(new int[]{45}),new int[]{45});
        Assert.assertEquals(ArrayUtils.bubbleSort(new int[]{45, 13}),new int[]{13, 45});
        Assert.assertEquals(ArrayUtils.bubbleSort(new int[]{45, 23, 56, -2}),new int[]{-2, 23, 45, 56});
        Assert.assertEquals(ArrayUtils.bubbleSort(new int[]{45, 27, 1, 2, 3}),new int[]{1, 2, 3, 27, 45});
        Assert.assertEquals(ArrayUtils.bubbleSort(new int[]{45, 12, 37, 12, 3}),new int[]{3, 12, 12, 37, 45});
    }
}
