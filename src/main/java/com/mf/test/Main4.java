package com.mf.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i ++){
            arr[i] = sc.nextInt();
        }
        if(num == 1){
            System.out.println(arr[0]);
            return ;
        }else if(num == 2){
            System.out.println(Math.abs(arr[1]-arr[0]));
            return ;
        }
        //排序
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            list.add(arr[i]);
        }
        List<Integer> listTemp = dealNum(list);
        for(int i = 0; i < listTemp.size(); i ++){
            System.out.println(listTemp.get(i));
        }
        System.out.println(Math.abs(listTemp.get(0)-listTemp.get(1)));

    }

    public static List dealNum(List<Integer> list){
        if(list.size() == 2)
            return list;
        else if(list.size() > 2){
            Collections.sort(list);
            int a = list.get(list.size()-1);
            int b = list.get(list.size()-2);
            if(a != b){
                list.set(list.size()-2, Math.abs(a-b));
                list.remove(list.size()-1);
            }else{
                list.set(list.size()-2, Math.abs(a-b));
                list.remove(list.size()-1);
            }
            return dealNum(list);
        }
        return list;
    }
}
