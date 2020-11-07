package com.design.adapter;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/10/18 0018 16:39
 */
public class Main {
    public static void main(String[] args) {
        Player f = new Forwards("Bill");
        f.attack();

        Player c = new Center("Jack");
        c.attack();

        Player foreignCenter = new Translator("yaoming");
        foreignCenter.attack();
        foreignCenter.defense();
    }
}
