package toolcode;

import java.util.*;

public class Test2 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        Set<Integer> integerSet = new HashSet<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i : nums1){
            integerList.add(i);
        }
        for (int i : nums2) {
            integerList.add(i);
        }
//        List<Integer> integerList = new ArrayList<>(integerSet);
        Collections.sort(integerList);
        return findMiddleNum(integerList);
    }

    public double findMiddleNum(List<Integer> num){
        int length = num.size();
        if (length == 0)
            return 0;
        //总长度为偶数
        if (length % 2 == 0 ){
            int a = num.get(length/2 - 1);
            int b = num.get(length/2);
            return  ((double) (a+ b))/2;
        }else{
            return num.get((length-1)/2);
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        Test2 test2 = new Test2();
//        double a = test2.findMedianSortedArrays(num1, num2);
//        System.out.println(a);
//        System.out.println(test2.reverse(123443213));
        int i = Integer.MAX_VALUE;
//        System.out.println(i);

//        System.out.println(test2.myAtoi(" -42"));
        String[] strs = {"absjk", "abfdd", "bc"};
        System.out.println(test2.longestCommonPrefix(strs));

    }

    public int reverse1(int x) {
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = -x;
        }
        String num = x + "";
        StringBuilder stringBuilder = new StringBuilder();
        int length = num.length();
        for (int i = length-1; i >= 0; i --) {
            stringBuilder.append(num.charAt(i));
        }
        String str = stringBuilder.toString();
        return flag?Integer.parseInt(str):-Integer.parseInt(str);
    }

    private int reverse(int x){
        int res = 0;
        while(x!=0){
            int temp = x%10;
            if (res > 214748364 || (res == 214748364 && temp > 7)){
                return 0;
            }else if (res < -214748364 || (res == -214748364 && temp < -8)) {
                return 0;
            }
            res = res * 10 + temp;
            x/=10;
        }
        return res;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        //找出最短的字符串
        String minStr = strs[0];
        for (int i = 1; i < strs.length; i ++) {
            minStr = minStr.length() <= strs[i].length() ? minStr : strs[i];
        }
        if (minStr.length() == 0)
            return minStr;
        for (int i = 0; i < strs.length; i ++) {
            for (int j = minStr.length(); j >= 0; j --) {
                if (minStr.substring(0, j).equals(strs[i].substring(0, j))){
                    minStr = minStr.substring(0, j);
                    if (minStr.length() == 0)
                        return minStr;
                    break;
                }
            }
        }
        return minStr;
    }

    public int myAtoi(String s) {
        s = s.trim();
        char[] chars = s.toCharArray();
        if (!Character.isDigit(chars[0])  && chars[0] != '-' && chars[0] != '+' ){
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int place = 0;
        for (int i = 0; i < chars.length; i ++) {
            if ( i <= chars.length-2 && chars[i] == '-' && Character.isDigit(chars[i + 1])){
                place = i;
                break;
            }else if (Character.isDigit(chars[i])){
                place = i;
                break;
            }
        }
        String firstStr = chars[place] + "";
        if (place == chars.length-1){
            return Integer.valueOf(firstStr);
        }
        while(Character.isDigit(chars[place + 1])){
                stringBuilder.append(chars[place + 1]);
                place ++;
                if (place == chars.length-1)
                    break;
        }
        String result = firstStr + stringBuilder.toString();
        //范围
//        int num = 0;
//        if (firstStr.equals("-")){
//            try {
//                num = Integer.valueOf(result);
//            } catch (Exception e) {
//                //e.printStackTrace();
//                return Integer.MIN_VALUE;
//            }
//        }else{
//            try {
//                num = Integer.valueOf(result);
//            } catch (Exception e) {
//                //e.printStackTrace();
//                return Integer.MAX_VALUE;
//            }
//        }
        long num = Long.parseLong(result);
        if (num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (num < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)num;

    }
}
