package com.pandy.desigin.principle.singleresponsibility;

/**
 * @author Pandy
 * @version 1.0
 * @date 9:24
 */
public class UserInfo {
    public void updateUserInfo(String username,String address){
        username = "Pandy";
        address = "beijing";
    }
    public void updateUsername(String username){
        username = "Pandy";
    }
    public void updateAddress(String address){
        address = "beijing";
    }
    public void updateUserInfo(String username,String address,String... properties){
        //todo
    }
    public void updateUserInfo(String username,String address,Boolean isup){
        if (isup){
            //todo
        }else {
            //todo
        }
        username = "Pandy";
        address = "beijing";
    }
}
