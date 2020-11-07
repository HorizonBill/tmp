package com.design.abstractFactoryB;

public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Department dpt = new Department();
//        IFactory factory = new SqlserverFactory();
////        IFactory factory = new AccessFactory();
//
//        IUser iu = factory.createUser();
//
//        iu.insert(user);
//        iu.getUser(13);
//
//        IDepartment iDepartment = factory.createDepartment();
//        iDepartment.insert(dpt);
//        iDepartment.getDepartment(13);

        DataAccess dataAccess = new DataAccess();
        IDepartment iDepartment = dataAccess.createDepartment();
        iDepartment.insert(dpt);
    }

}
