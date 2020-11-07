package com.mf.test;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("[^\\d]");
        //System.out.println(arr.length);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            if(" ".equals(arr[i]) || "".equals(arr[i]))
                continue;
            list.add(Integer.parseInt(arr[i]));
        }
        List<Integer> list1 = new ArrayList<>();
        if(list.size() == 0){
            System.out.println(0);
            return ;
        }else if(list.size() == 4){
            System.out.println(1);
            return ;
        }else if(list.size() > 4){
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            for(int i = 0; i < list.size(); i = i + 2){
                treeMap.put(list.get(i), list.get(i + 1));
            }
            int[][] nums= new int[list.size()][2];
            int k = 0;
           for(Map.Entry entry : treeMap.entrySet()){
                int a = (Integer) entry.getKey();
                int b = (Integer)entry.getValue();
                nums[k][0] = a;
                nums[k][1] = b;
                k ++;
           }
           int num = 0;
            for(int i = 0; i < list.size()-1; i ++){
               if(nums[i][0] > nums[i+1][0] && nums[i][0] > nums[i+1][0]
                       && nums[i][1] > nums[i+1][1] && nums[i][1] > nums[i+1][1] ){
                   num ++;
               }else{
                   break;
               }
            }
            System.out.println(num);
        }


    }
}
