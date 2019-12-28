package com.zeroten.common.util;

import java.util.Arrays;

public class ArrayUtils {

//    对传⼊的 int 数组进⾏排序，从⼩到⼤，并返回排序后的结果。
//    选择排序:前面的已经排序好的下一位位置的元素，是从该位置后的元素（未排序好）中选择最小的数，插入到排序好的下一位
//    时间复杂度O(n^2)，空间复杂度O(1)
    public static int[] selectionSort(int[] arr){
        if(arr.length <= 1)
            return arr;
        int min;
        for(int index = 0; index < arr.length-1; index++){
             min = index;
            for(int index2 = index + 1; index2 < arr.length; index2++){
                if(arr[min] > arr[index2])
                    min = index2;
            }
            int temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

//    插入排序，前面的是排序好的元素，排序好的下一位元素value对前面已经排序好的元素进行遍历，
//    从value的前一位开始遍历，遍历到的元素大于value，则该素往后一位，小于或等于value，则将value存放在该元素的后一位
//    时间复杂度O(n^2)，空间复杂度O(1)
    public static int[] insertionSort(int[] arr){
        if(arr.length < 2)
            return arr;
        int value;
        int index,index2;
        for(index = 1; index < arr.length; index++){
            value = arr[index];
            for(index2 = index-1; index2 >= 0; index2--){
                if(value < arr[index2]){
                    arr[index2+1] = arr[index2];
                }else{
                    break;
                }
            }
            arr[index2+1] = value;
        }
        return arr;
    }

//    冒泡排序：每一次循环比较相邻的两个元素，将最大的数往后挪并排序好
//    时间复杂度：O(n^2)，空间复杂度O(1)
    public static int[] bubbleSort(int[] arr){
        if(arr.length < 2)
            return arr;
        boolean work = true;    //用于判断是否进行过调整，进行过则表示还要继续循环调整
        for(int pass = 0; pass < arr.length; pass++){
            //pass表示数组最大的pass个元素已经排序好了，后面的操作就不用继续比较这几个元素了
            if(work == false)
                break;
            work = false;
            for(int index = 0; index < arr.length-pass-1; index++){
                if(arr[index] > arr[index+1]){
                    work = true;
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args){
        int[] arr = new int[]{45, 12, 37, 12, 3};
        System.out.println(Arrays.toString(ArrayUtils.bubbleSort(arr)));
    }

}
