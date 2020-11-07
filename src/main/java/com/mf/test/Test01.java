package com.mf.test;

import java.util.*;

public class Test01 {
    /**
     * 默认s为
     * @param s
     * @param p
     * @return
     */
    public boolean isMatch(String s, String p) {
        return false;
    }

    public static void main(String[] args) {
//
//  StringTokenizer st = new StringTokenizer("hello world");

        Collection<String> c = new LinkedList<>();
        Collections.addAll(c, "split String list".split(" "));
        for (String s : c){
            System.out.println(s);
        }
        System.out.println(2);
    }
}
