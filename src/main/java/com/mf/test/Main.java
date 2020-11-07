package com.mf.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ()->{System.out.print("qwqe");};
//        System.out.print("ad");
//
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM:uuuu")));
//
//        Instant in = Instant.now();
//        System.out.println(in);
//        System.out.println(in.getEpochSecond());
////        LocalDateTime dateTime = LocalDateTime.now();
////        System.out.println(dateTime);
//
//        Integer i = 1404, j=1404, n=1,m=1;
//        System.out.println(i==j);
//        System.out.println(m==n);
//        Scanner in = new Scanner(System.in);
//        float f = in.nextFloat();
//        System.out.println(Math.round(f));

        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        if(a.length()<=2){
            System.out.println("输入数据长度错误！");
            return;
        }
        if(!("0x".equals(a.substring(0,2))  || "0X".equals(a.substring(0,2)))){
            System.out.println("输入数据格式错误！");
            return;
        }
        String s = a.substring(2).toUpperCase();

        if(!s.matches("[0-9A-F]*")){
            System.out.println("输入错误！");
        }
//        System.out.println(change(s));
        System.out.println(Integer.valueOf(s, 16).toString());

        System.out.println(Integer.valueOf("21", 8).toString());

        System.out.println(Integer.valueOf("21", 10).toString());
    }


    /**
     * 十六进制转化为10进制
     * @param content 去掉0x，并校验过的十六进制字符串
     * @return
     */
    public static int change(String content){
        int num = 0;
        String[] highLetter = {"A","B","C","D","E","F"};
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i <= 9; i ++ ){
            map.put(i+"",i);
        }
        for(int j = 0; j < 6; j++){
            map.put(highLetter[j], j+10);
        }
        String[] arr = new String[content.length()];
        for(int i = 0; i < content.length(); i ++){
            arr[i] = content.substring(i,i+1);
        }
        for(int i = 0; i < content.length(); i ++){
            num += map.get(arr[i])*Math.pow(16, content.length()-1-i);
        }
        return num;
    }
}
