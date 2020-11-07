package com.mf.test1;

import java.util.*;

public class Main {
    public Main(){}

    public static void main(String[] args) {

        String[] arr = {"cat", "caaat", "car"};
       String s = "caat";
        System.out.println(learnWord(arr, s));

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
