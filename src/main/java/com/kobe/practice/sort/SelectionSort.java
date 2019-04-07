package com.kobe.practice.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 *              平均、最好、最坏时间复杂度为O(n^2)，空间复杂度为O(1)，不稳定
 * @Author Tao
 * @Date 2019-04-07 21:51
 * @Version 1.0
 */
public class SelectionSort {

    /**
     * 遍历元素，找到一个最大或者最小的元素，把他放在第一个位置，再在剩余元素中找到最大或最小元素，把它放到第二个位置，如此循环
     * @param arr
     */
    public static void sort(int[] arr) {

        // 剩余一个元素的时候不用排序
        for (int i = 0; i < arr.length - 1; i++) {
            // minIndex记录当前最小值的索引位置，默认为i
            int minIndex = i;
            // 从第i+1个开始，arr.length结束，找到最小值的位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 交换当前索引和最小值索引的值
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            // 本次循环结束，当前索引i为本次查找元素里最小值的位置
        }

    }

    public static void main(String[] args) {

        Random r = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println("排序前：" + Arrays.toString(arr));

        sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));



    }

}
