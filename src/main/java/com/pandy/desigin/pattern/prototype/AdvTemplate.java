package com.pandy.desigin.pattern.prototype;

/**
 * @author Pandy
 * 广告信模板代码
 */
public class AdvTemplate {

    //广告信名称
    private String advSubject = "XX银行国庆节抽奖活动";
    //广告信内容
    private String advContext = "国庆抽奖通知...";

    //取得广告信名称
    public String getAdvSubject() {
        return advSubject;
    }

    //取得广告信内容
    public String getAdvContext() {
        return advContext;
    }
}
