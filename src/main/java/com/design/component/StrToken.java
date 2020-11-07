package com.design.component;

/**
 * @author Administrator
 * @ClassName StrToken
 * @description
 * @time 2020/10/18 0018 20:18
 */
public class StrToken {
    public static String singleLine(String token, int dept){
        if (dept <= 0)
            return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dept; i ++)
            sb.append(token);
        return sb.toString();
    }
}
