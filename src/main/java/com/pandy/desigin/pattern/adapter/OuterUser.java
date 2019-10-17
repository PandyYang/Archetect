package com.pandy.desigin.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pandy
 */
public class OuterUser implements IOuterUser {
    /**
     * 用户基本信息
     * @return
     */
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("username","员工1");
        baseInfoMap.put("mobileNumber","手机号11");
        return baseInfoMap;
    }

    /**
     * 员工的家庭信息
     * @return
     */
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","职位是loser");
        officeInfo.put("officeTelNumber","员工的办公电话是..");
        return officeInfo;
    }

    /**
     * 员工的工作信息 职位
     * @return
     */
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","家庭电话1");
        homeInfo.put("homeAddress","员工的家庭住址是...");
        return homeInfo;
    }
}
