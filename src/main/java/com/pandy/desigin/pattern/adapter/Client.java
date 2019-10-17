package com.pandy.desigin.pattern.adapter;

/**
 * @author Pandy
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for (int i = 0;i<101;i++){
            youngGirl.getMobileNumber();
        }
        IUserInfo youngBoy = new OuterUserInfo();
        for (int i = 0;i < 101;i++){
            youngBoy.getMobileNumber();
        }
    }
}
