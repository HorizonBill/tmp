package com.design.abstractFactoryB;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("access insert one people...");
    }

    @Override
    public User getUser(int id) {
        System.out.println("access get one user...");
        return null;
    }
}
