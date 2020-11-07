package com.mf.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        if(str.length()>10000){
            System.out.println("输入字符串过长！");
            return ;
        }
        List<String> listWord = new ArrayList<String>();
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i ++){
            if(words[i].matches("[a-z]*")){
                listWord.add(change(words[i]));
            }
        }
        int num = 0;
        for(String word : listWord){
            num += checkPriWord(word);
        }
        System.out.println(num);
    }

    /**
     * 子串串反转
     * @param str
     * @return
     */
    public static String change(String str){
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
        return sb.toString();
    }

    /**
     * 判断字符串中开元音的个数
     * @param str
     * @return
     */
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
}
