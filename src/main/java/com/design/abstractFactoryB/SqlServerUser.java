package com.design.abstractFactoryB;


public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("sqlserver insert one people...");
    }

    @Override
    public User getUser(int id) {
        System.out.println("sqlserver get one user...");
        return null;
    }
}
