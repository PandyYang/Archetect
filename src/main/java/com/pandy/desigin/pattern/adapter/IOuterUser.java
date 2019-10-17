package com.pandy.desigin.pattern.adapter;

import java.util.Map;

/**
 * @author Pandy
 * 外来人员
 */
public interface IOuterUser {
    //基本信息 名称 性别 手机号码
    public Map getUserBaseInfo();
    //工作区域信息
    public Map getUserOfficeInfo();
    //用户的家庭信息
    public Map getUserHomeInfo();
}
