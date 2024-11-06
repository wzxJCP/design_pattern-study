package com.xing.principle_7.demeter_05;

public class Boss implements Manager {
    public void meet(TeamLeader teamLeader) {
        System.out.println("老板召集项目经理开会,分配任务。");
        teamLeader.assginTasks();
    }
}
