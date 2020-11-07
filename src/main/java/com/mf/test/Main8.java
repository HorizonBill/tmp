package com.mf.test;

import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dcaddc"));

    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;        //最长子串长度
        int left = 0;       //滑动窗口左下标，i相当于滑动窗口右下标
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                //map.get():返回字符所对应的索引，当发现重复元素时，窗口左指针右移
                //map.get('a')=0,因为map中只有第一个a的下标，然后更新left指针到原来left的的下一位
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-left+1);
        }
        return max;
    }
    public static int lengthOfLongestSubstring1(String s) {
        if(s == null || "".equals(s))
            return 0;
        char[] arr = s.toCharArray();
        char[] tmp = new char[s.length()];
        TreeMap<Integer, String> map = new TreeMap<>();
        for(int i = 0; i < arr.length-1; i ++){
            for(int j = i + 1; j < arr.length; j ++){
               tmp =  clearChar(tmp);
                System.arraycopy(arr,i,tmp,0, j-i+1);
                if(checkStrDouble(tmp)){
                    map.put(j-i+1, s.substring(i, j+1));
                }
            }
        }
        if(map.size() == 0)
            return 1;
        return map.lastKey();
    }

    public static char[] clearChar(char[] tmp){
        for(int i = 0; i < tmp.length; i ++){
            tmp[i] = 0;
        }
        return tmp;
    }
    public static boolean checkStrDouble(char[] tmp){
        Set<Character> set = new HashSet<>();
        Character[] arr = new Character[tmp.length];
        int num = 0;  //不为空的元素个数
        for (int i = 0; i < tmp.length; i ++) {
            if(tmp[i] != 0) {
                arr[i] = tmp[i];
                num ++;
            }
        }
        for(int i = 0; i< num;i++){
            set.add(arr[i]);
        }

       return set.size() == num;
    }
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        for(int i = 0; i < nums.length-1; i ++){
            for(int j = i + 1; j < nums.length; j ++){
                int sum = nums[i] + nums[j];
                if(sum == target ){
                    System.out.println(nums[i] + " " + nums[j]);
                    System.out.println(i + " " + j);
                    indexs[0] = i;
                    indexs[1] = j;
                    break;
                }
            }

        }
        return indexs;
    }
}
