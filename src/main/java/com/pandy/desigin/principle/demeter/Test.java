package com.pandy.desigin.principle.demeter;

/**
 * @author Pandy
 * @version 1.0
 * @date 12:20
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
