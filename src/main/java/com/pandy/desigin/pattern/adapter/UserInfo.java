package com.pandy.desigin.pattern.adapter;

/**
 * @author Pandy
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("员工姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭住址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("移动电话号码");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("公司电话号码");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("员工职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭号码");
        return null;
    }
}
