package com.mf.instance;

import sun.management.ThreadInfoCompositeData;

import java.io.*;

public class Run {
    public static void main(String[] args) throws Exception {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fosRef = new FileOutputStream(new File("MyObject.text"));
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            fosRef.close();
            System.out.println(myObject.hashCode());
        } finally {
            System.out.println("----");
        }
        FileInputStream fileInputStream = new FileInputStream(new File("MyObject.text"));
        ObjectInputStream iosRef = new ObjectInputStream(fileInputStream);
        MyObject myObject = (MyObject) iosRef.readObject();
        iosRef.close();
        fileInputStream.close();
        System.out.println(myObject.hashCode());

    }
}
