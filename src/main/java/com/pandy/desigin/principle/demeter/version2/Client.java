package com.pandy.desigin.principle.demeter.version2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:25
 */
public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        /*teacher.command(new GroupLeader());*/
        List<Girl> listGirls = new ArrayList<Girl>();
        for (int i = 0;i<20;i++){
            listGirls.add(new Girl());
        }
        teacher.command(new GroupLeader(listGirls));
    }
}
