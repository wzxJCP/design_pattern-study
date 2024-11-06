package com.xing.principle_7.demeter_05;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        PythonProgrammer pythonProgrammer = new PythonProgrammer();
        //老板,通知项目经理,开会
        boss.meet(teamLeader);
        //项目经理,通知开发人员分配任务
        teamLeader.setProgrammers(javaProgrammer);
        teamLeader.assginTasks();
        teamLeader.setProgrammers(pythonProgrammer);
        teamLeader.assginTasks();
    }
}
/**
 * Boss类实现管理者接口，管理者接口继承人类类，抽象工程师类实现人类类，Java工程师类和Python工程师类继承抽象工程师类，
 * 项目经理类实现管理者接口；测试类，老板召集项目经理开会分配任务→项目经理根据程序员分配对应的任务→最后程序员写代码完成任务。
 */
