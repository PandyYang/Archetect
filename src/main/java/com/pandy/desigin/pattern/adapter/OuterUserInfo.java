package com.pandy.desigin.pattern.adapter;

import java.util.Map;

/**
 * @author Pandy
 * 中转角色
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    //员工的基本信息
    private Map baseInfo = super.getUserBaseInfo();
    //员工的家庭信息
    private Map homeInfo = super.getUserHomeInfo();
    //工作信息
    private Map officeInfo = super.getUserOfficeInfo();


    @Override
    public String getUserName() {
        String username = (String) this.baseInfo.get("username");
        System.out.println(username);
        return username;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String)this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String)this.officeInfo.get("jobPosition");
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeInfo.get("Home");
        return homeTelNumber;
    }
}