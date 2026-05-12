package com.xing.a_principle_7.a_06_law_of_demeter;

public class Boss implements Manager {
    public void meet(TeamLeader teamLeader) {
        System.out.println("老板召集项目经理开会,分配任务。");
        teamLeader.assginTasks();
    }
}
