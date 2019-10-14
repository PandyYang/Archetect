package com.pandy.desigin.principle.demeter.version2;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:20
 */
public class Teacher {
    public void command(GroupLeader groupLeader){
        /*List<Girl> listGirls = new ArrayList<Girl>();
        for (int i = 0;i < 20;i++){
            listGirls.add(new Girl());
        }*/
        groupLeader.countGirls();
    }
}
