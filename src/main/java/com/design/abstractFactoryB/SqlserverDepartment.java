package com.design.abstractFactoryB;

public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("sql server insert one record");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("sql server : get one record by id");
        return null;
    }
}
