package com.design.abstractFactoryB;


public class DataAccess {
    private static final String db = "com.design.abstractFactoryB.Sqlserver";

    public IUser createUser() throws Exception{
        Class class11 = Class.forName(db+"User");
       return  (IUser) class11.newInstance();
    }

    public IDepartment createDepartment() throws Exception{
        Class class11 = Class.forName(db+"Department");
        return (IDepartment) class11.newInstance();
    }
}
