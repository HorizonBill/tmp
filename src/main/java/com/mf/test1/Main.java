package com.mf.test1;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public Main(){}

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("a1");
        list.add("a2");
        list.add(0, "b1");
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static  int learnWord(String[] arr, String destWord){
        List<Map<Character, Integer>> list = new ArrayList<>();
        if (arr == null || arr.length == 0 || null == destWord)
             return 0;
        for (int i = 0; i < arr.length; i ++) {
            list.add(dealStr(arr[i]));
        }
        Map<Character, Integer> mapDest = dealStr(destWord);
        int totalNum = 0;
        for(int i = 0; i < list.size(); i ++){
            Map<Character, Integer> map = list.get(i);
            boolean flag = false;
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                Character c = entry.getKey();
                int num = entry.getValue();
                if(mapDest.get(c) == null || mapDest.get(c) < num){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                totalNum ++;
        }
        return totalNum;
    }

    /**
     * 分析统计字符串的个数
     * @param str
     * @return
     */
    public static Map dealStr(String str){
        Map<Character, Integer> map = new HashMap<>();
        if(str == null || "".equals(str))
            return map;
        char[] c = str.toCharArray();
        for(int i = 0; i < c.length; i++){
            Character tmp = c[i];
            if (map.get(tmp) == null)
                map.put(tmp, 1);
            else{
                map.put(tmp, map.get(tmp)+1);
            }
        }
        return map;
    }

}
