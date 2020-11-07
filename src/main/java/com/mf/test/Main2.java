package com.mf.test;

import java.util.*;

public class Main2 {
    public static String NUM = "0123456789";
    public static void main(String[] args){

        System.out.println(Integer.MIN_VALUE);
        String s = " -2147483649 ";
//        System.out.println(s.compareTo("-2147483648"));
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String str) {
        if (str == null || "".equals(str.trim()))
            return 0;
        String s = str.trim();
        String maxStrNum = Integer.MAX_VALUE + "";
        String minStrNum = Integer.MIN_VALUE + "";
        if ("-".equals(s))
            return 0;
        if( s.length() >= 2
                && "+".equals(s.substring(0,1))
                && NUM.contains(s.substring(1,2)) )
            s = s.substring(1);
        if(s.length() >= 2
                && "-".equals(s.substring(0,1))
                && !NUM.contains(s.substring(1,2)) ){
            return  0;
        }
        if (!NUM.contains(s.substring(0,1)) && !"-".equals(s.substring(0,1))){
            return 0;
        }
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        if (!"-".equals(s.substring(0,1))){
            for(int i = 0; i < s.length(); i++){
                if("0".equals(s.substring(i,i+1)) && !flag)
                    continue;
                if(NUM.contains(s.substring(i,i+1))) {
                    sb.append(s.substring(i, i + 1));
                    flag = true;
                }else{
                    break;
                }

            }
        }else {
            sb.append("-");
            for(int i = 1; i < s.length(); i++){
                if("0".equals(s.substring(i,i+1))  && !flag)
                    continue;
                if(NUM.contains(s.substring(i,i+1))) {
                    sb.append(s.substring(i, i + 1));
                    flag = true;
                }else{
                    break;
                }
            }
        }
//        System.out.println(sb.toString());
        String num = sb.toString();
        if ("".equals(num) || "-".equals(num))
            return 0;
        if (!num.contains("-")){
            if (num.length() > maxStrNum.length())
                return Integer.MAX_VALUE;
            else if( num.length() == maxStrNum.length() && num.compareTo(maxStrNum) >= 0)
                return Integer.MAX_VALUE;
            else if(num.compareTo(maxStrNum) < 0)
               return Integer.parseInt(sb.toString());
        }else {
            if (num.length() > minStrNum.length())
                return Integer.MIN_VALUE;
            else if( num.length() == minStrNum.length() && num.compareTo(minStrNum) >= 0)
                return Integer.MIN_VALUE;
            else if(num.compareTo(minStrNum) < 0)
                return Integer.parseInt(sb.toString());
        }

        return num.trim().equals("")?0:Integer.parseInt(num);
    }
    /**
     * 效率最高，使用了动态规划
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }

    public static String longestPalindrome2(String s) {

        if(s == null || s.length() == 0)
            return "";
        if (s.length() == 1)
            return s;
        String result = s;
       // int i = 0, j = s.length();
       for(int i = 0; i < s.length(); i ++){
           for(int j = 0; j <= i; j ++){
               result = s.substring(j, s.length()-i+j);
               if(checkStr(result))
                   return result;
           }

       }
        if ("".equals(result))
            return s.substring(0,1);
        return result;
    }

    public static String longestPalindrome1(String s) {
        if(s == null || s.length() == 0)
            return "";
        if (s.length() == 1)
            return s;
        String result = "";
        for(int i = s.length()-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                String tmp = s.substring(j , i+1);
                if (checkStr(tmp) && tmp.length() > result.length())
                    result = tmp;
            }
        }
        if ("".equals(result))
            return s.substring(0,1);
        return result;
    }

    /***
     * 检查字符串是否为回文字
     * @param str
     * @return
     */
    public static boolean checkStr(String str){
        if(str == null || "".equals(str))
            return false;
        char[] c = str.toCharArray();
        for(int i = 0; i < str.length()/2; i ++){
            if(c[i] != c[str.length()-1-i])
                return false;
        }
        return true;
    }

    public static String change1(String str){
        if(str == null || "".equals(str))
            return null;
        String[] arr = new String[str.length()];
        for(int i = 0; i < str.length(); i ++){
            arr[i] = str.substring(i, i+1);
        }
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1; i >= 0; i --){
            sb.append(arr[i]);
        }
        System.out.println(str);
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static int checkPriWord(String str){
        if(str==null || str.length()<4)
            return 0;
        String flag1 = "bcdfghgklmnpqrstvwxyz";
        String flag2 = "aeiou";
        String flag3 = "bcdfghgklmnpqstvwxyz";
        int num = 0;
        if (str.length()>=0){
            for(int i = 0; i + 3< str.length(); i ++){
                String s = str.substring(i, i+4);   //所截取的字符串
                //判断开元音
                if("e".equals(s.substring(3, 4))
                        &&  flag1.contains(s.substring(0, 1))
                        &&  flag2.contains(s.substring(1, 2))
                        &&  flag3.contains(s.substring(2, 3))) {
                    num ++;
                }
            }
        }
        return num;
    }

    public static String change(String str) {
        if (str.matches("[a-zA-Z]*|\\s+"))
            return str;
        else {
            String[] a = new String[str.length()];
            for (int i = 0; i < str.length(); i++) {
                a[i] = str.substring(i, i + 1);
            }
            for (int i = 0; i < str.length(); i++) {
                if (!a[i].matches("[a-zA-Z]*|\\s+")) {
                    a[i] = " ";
                }
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < a.length; i++) {
                if(i == a.length-1 && " ".equals(a[i]) )
                    continue;
                if (a[i].equals(a[i+1]) && " ".equals(a[i]))
                    continue;
                sb.append(a[i]);
            }
            return sb.toString();
        }
    }
}
