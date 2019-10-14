package com.pandy.desigin.principle.demeter.version2;

import java.util.List;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:20
 */
public class GroupLeader {
    private List<Girl> listGirls;
    public GroupLeader(List<Girl> _listGirls){
        this.listGirls = _listGirls;
    }
    public void countGirls(){
        System.out.println("女生的数量是:"+this.listGirls.size());
    }
}
