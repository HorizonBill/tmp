package com.mf.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main1 {

    /**
     * DCL双检查锁机制
     * sychronsized  ， 判断是否为null
     */
    private static Main1 m ;
    private Main1(){}
    public static Main1 getInstance() {
        try {
            if(m != null) {
                System.out.println("扩展");
            }else {
                Thread.sleep(200);
                synchronized (Main1.class) {
                    if(m == null)
                        m = new Main1();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("资源关闭");
        }
        return m;
    }

    public static void main(String[] args){


    }



    public void test1(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(int i = 0; i < words.length;i ++){
            if(!words[i].matches("[a-zA-Z]*") || words[i].length()>20)
                System.out.println("输入错误");
        }
        StringBuffer sb = new StringBuffer();
        for(int i = words.length-1; i>=0; i--){
            System.out.println(words[i]);
            sb.append(words[i]).append(" ");
        }
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb.toString());
    }
}
