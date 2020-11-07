package com.mf.test;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        int i, j, temp, t;
        if(low>high)
            return ;
        i = low;
        j = high;
        temp = arr[low];
        while(i < j){
            //先看右边，依次往左递减
            /**
             * #先从右往左找一个小于 基准位的数
             *             #当右边的哨兵位置所在的数>基准位的数 时
             *             #继续从右往左找（同时 j 索引-1）
             *             #找到后会跳出 while循环
             */
            while(temp <= arr[j] && i < j){
                j --;
            }
            while(temp>=arr[i] && i < j){
                i ++;
            }
            //如果满足条件则交换
            if(i < j){
                int z = arr[i];
                arr[i] = arr[j];
                arr[j] = z;
            }
        }

        //一轮交换完，换基准值
        arr[low] = arr[i];
        arr[i] = temp;

        //递归调用左边数组
        quickSort(arr, low, j-1);
        //递归调用右边数组
        quickSort(arr, j + 1, high);
    }

    public static void shellSort(int[] data){
        int j = 0;
        int max = 0;
        for (int step = data.length/2; step > 0; step/=2) {
            for(int i = step; i < data.length; i ++){
                max = data[i];
                for (j = i; j >= step; j -= step) {
                    if(max > data[j - step]) {
                        data[j] = data[j-step];
                    }else {
                        break;
                    }
                }
                data[j] = max;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {14,6,8,1,2,9};
//        quickSort(arr, 0, arr.length-1);
        shellSort(arr);
        for(int i = 0; i < arr.length; i ++){
            System.out.println("args = " + arr[i] + "");
        }
    }
}
