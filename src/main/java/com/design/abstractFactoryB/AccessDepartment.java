package com.design.abstractFactoryB;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("access : add one dept record ");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("access: get one dept record by id");
        return null;
    }
}
